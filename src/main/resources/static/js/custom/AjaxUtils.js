"use strict";
/**
 * 트리 Utils
 *
 * @author jason, Moon
 */
let AJAX_TYPE = {
    GET: "GET",
    POST: "POST",
    PUT: "PUT",
    DELETE: "DELETE"
};

(function () { if (null == window["jQuery"] || null != window["AjaxUtils"]) return;

    window.AjaxUtils = {
        request: function (options) {
            $.ajax(window.AjaxUtils.getRequestProperties(options));

        },

        getRequestProperties: function(options) {

            let result = $.extend("{}", options);

            let TYPE = options.type || AJAX_TYPE.GET;

            if (!result.data) result.data = {};

            result.data        = AjaxUtils.getRequestData(result.data, TYPE);
            result.contentType = AjaxUtils.getRequestContentType(result.contentType);
            result.success     = AjaxUtils.getRequestSuccess(result.success);
            result.error       = AjaxUtils.getRequestError(result.error);

            return result;
        },

        // 요청 Data 가져오기
        getRequestData: function(data, type) {

            if (null == data || undefined === data) data = {};

            data["inqCon"] = JSON.stringify(data); // 공통 프로그램 접근 로그 저장용. // ProgramAccessAOP 에서 처리.

            return type.toUpperCase() !== AJAX_TYPE.GET ? JSON.stringify(data) : $.param(data);
        },

        // 요청 오류 // 공통 발생
        errorRequest: function(jqXHR, textStatus, errorThrown) {
            alert("요청 중 오류가 발생했습니다. 관리자에게 문의해 주십시오.")
        },

        // 요청 Error 가져오기
        getRequestError: function(error) {

            let result;

            if (null == error) {

                result = AjaxUtils.errorRequest;
            } else {

                result = function(response) {

                    AjaxUtils.errorRequest(response);

                    if (null != error) error(response);
                };
            }

            return result;
        },

        // 요청 성공 // 공통 성공
        successRequest: function (response) {
            // console.log(response);
        },

        getRequestSuccess: function (success) {

            let result;

            if (null == success) {

                result = AjaxUtils.successRequest;
            } else {

                result = function (response) {

                    AjaxUtils.successRequest(response);

                    if (null != success) {
                        success(response);
                    }
                };
            }

            return result;
        },

        // 요청 Content Type 가져오기
        getRequestContentType: function(contentType) {

            let result;

            if (null != contentType && 0 < contentType.length)
                result = contentType;
            else
                result = "application/json; charset=UTF-8";

            return result;
        }
    }
})();