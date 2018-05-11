package io.kbdhunters.menu;

import io.kbdhunters.common.vo.ResponseVO;
import io.kbdhunters.common.vo.ResultCode;
import io.kbdhunters.menu.dto.MenuConditionDTO;
import io.kbdhunters.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason, Moon
 * @since 2018-05-12.
 */
@RestController
public class MenuRestController {

    private final MenuService menuService;

    @Autowired
    public MenuRestController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/api/menu/getTree")
    public ResponseVO getTreeList(MenuConditionDTO menuConditionDTO) {
        return ResponseVO.of(ResultCode.SUCCESS, menuService.getTreeList(menuConditionDTO));
    }
}
