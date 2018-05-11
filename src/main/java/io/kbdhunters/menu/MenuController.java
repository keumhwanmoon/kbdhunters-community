package io.kbdhunters.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2018-05-12.
 */
@Controller
public class MenuController {

    @GetMapping("/menu/menuManage")
    public ModelAndView getPage() {
        return new ModelAndView("/menu/menuManage");
    }
}
