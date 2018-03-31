package io.kbdhunters.code.mapper;

import io.kbdhunters.code.dto.CodeConditionDTO;
import io.kbdhunters.code.dto.CodeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2018-03-31.
 */
@Mapper
@Repository
public interface CodeMapper {
    List<CodeDTO> getList(CodeConditionDTO codeConditionDTO);
}
