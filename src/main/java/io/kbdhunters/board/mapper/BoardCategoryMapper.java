package io.kbdhunters.board.mapper;

import io.kbdhunters.board.dto.BoardCategoryDTO;
import io.kbdhunters.board.dto.BoardConditionDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2018-05-22.
 */
@Mapper
@Repository
public interface BoardCategoryMapper {
    List<BoardCategoryDTO> getList(BoardConditionDTO conditionDTO);
}
