package io.kbdhunters.board.service;

import io.kbdhunters.board.dto.BoardConditionDTO;
import io.kbdhunters.board.dto.BoardPostDTO;
import io.kbdhunters.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2018-05-17.
 */
@Service
public class BoardService {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<BoardPostDTO> getBoardList(BoardConditionDTO conditionDTO) {
        return boardMapper.getBoardList(conditionDTO);
    }
}
