package io.kbdhunters.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2018-03-31.
 */
@Controller
public class CodeController {

    @GetMapping("/code/codeManage")
    public ModelAndView getPage() {
        return new ModelAndView("/code/codeManage");
    }
}
