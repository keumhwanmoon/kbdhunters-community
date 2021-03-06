"use strict";
/**
 * 트리 Utils
 *
 * @author jason, Moon
 * @see https://github.com/mar10/fancytree
 * @see http://wwwendt.de/tech/fancytree/demo/
 */

(function () { if (null == window["jQuery"] || null != window["TreeUtils"]) return;

    window.TreeUtils = {

        init: function (target, url, config) {

            let _this = this;

            try {
                _this.getTree(target);

                target.fancytree("destroy");
            } catch (e) {
                console.log("tree init! on :: " + target.attr("id") + "");
            }

            if (config.param) url = url + "?" + $.param(config.param);

            let defaultConfig = {
                source: {url: url},
                cache: false,
                postProcess: function (event, data) {
                    data.result = _this.convertData(data);
                },

                init: function (event, data, flag) {
                    _this.expandAll(target);

                    target.fancytree("getRootNode").sortChildren(_this.sortByNodeSortNo, true);
                }
            };

            target.fancytree($.extend(defaultConfig, config));
        },

        sortByNodeSortNo: function (node, node2) {
            return node.data.nodeSortNo - node2.data.nodeSortNo;
        },

        expandAll: function (target) {
            target.fancytree("getTree").visit(function (node) {
                node.setExpanded();
            });
        },

        getLevel: function (target) {
            this.getSelectedNode(target).node.getLevel();
        },

        convertData: function (data) {

            let array = data.response.resultList; // 서버에서 ResponseVO가 리턴되므로, 목록을 꺼낸다.

            let map = {};

            for (let i = 0; i < array.length; i++) {

                let obj = array[i];

                obj.children = [];

                map[obj.nodeKey] = obj;

                let parent = obj.parentNodeKey; // 최상단은 parentKey가 'ROOT'로 설정하도록 한다.

                if (!map[parent]) {

                    map[parent] = {
                        children: []
                    };
                }

                map[parent].children.push(obj);
            }

            return map['ROOT'].children;
        }
    };
})();