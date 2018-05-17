package io.kbdhunters.board;

import io.kbdhunters.board.dto.BoardConditionDTO;
import io.kbdhunters.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2018-05-14.
 */
@Controller
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board/boardList")
    public ModelAndView getListPage(BoardConditionDTO conditionDTO) {
        ModelAndView mv = new ModelAndView("/board/boardList");

        mv.addObject("boardList", boardService.getBoardList(conditionDTO));

        return mv;
    }

    @GetMapping("/board/boardRegister")
    public ModelAndView getRegisterPage() {
        return new ModelAndView("/board/boardRegister");
    }
}
