package io.kbdhunters.common.service;

import io.kbdhunters.board.dto.BoardCategoryDTO;
import io.kbdhunters.board.dto.BoardConditionDTO;
import io.kbdhunters.board.mapper.BoardCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2018-05-22.
 */
@Service
public class BoardCategoryService {

    private final BoardCategoryMapper boardCategoryMapper;

    @Autowired
    public BoardCategoryService(BoardCategoryMapper boardCategoryMapper) {
        this.boardCategoryMapper = boardCategoryMapper;
    }

    public List<BoardCategoryDTO> getList(BoardConditionDTO conditionDTO) {
        return boardCategoryMapper.getList(conditionDTO);
    }
}
