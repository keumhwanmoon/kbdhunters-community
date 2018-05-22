package io.kbdhunters.board;

import io.kbdhunters.board.dto.BoardPostDTO;
import io.kbdhunters.board.service.BoardService;
import io.kbdhunters.common.vo.ResponseVO;
import io.kbdhunters.common.vo.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason, Moon
 * @since 2018-05-22.
 */
@RestController
public class BoardRestController {

    private final BoardService boardService;

    @Autowired
    public BoardRestController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/api/board/register")
    public ResponseVO save(@RequestBody BoardPostDTO boardPostDTO) {
        boardPostDTO.setRegisterUserId("admin");
        boardPostDTO.setRegisterUserIp("127.0.0.1");

        return ResponseVO.of(ResultCode.SUCCESS, boardService.register(boardPostDTO));
    }
}
