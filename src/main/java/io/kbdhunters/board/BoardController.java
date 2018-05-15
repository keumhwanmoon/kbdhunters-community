package io.kbdhunters.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2018-05-14.
 */
@Controller
public class BoardController {

    @GetMapping("/board/boardList")
    public ModelAndView getListPage() {
        return new ModelAndView("/board/boardList");
    }

    @GetMapping("/board/boardRegister")
    public ModelAndView getRegisterPage() {
        return new ModelAndView("/board/boardRegister");
    }
}
