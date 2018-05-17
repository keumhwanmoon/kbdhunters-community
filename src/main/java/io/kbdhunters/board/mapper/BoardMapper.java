package io.kbdhunters.board.mapper;

import io.kbdhunters.board.dto.BoardConditionDTO;
import io.kbdhunters.board.dto.BoardPostDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2018-05-17.
 */
@Mapper
@Repository
public interface BoardMapper {

    List<BoardPostDTO> getBoardList(BoardConditionDTO conditionDTO);
}
