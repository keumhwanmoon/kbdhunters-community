package io.kbdhunters.code.service;

import io.kbdhunters.code.dto.CodeConditionDTO;
import io.kbdhunters.code.dto.CodeDTO;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2018-03-31.
 */
public interface CodeService {
    List<CodeDTO> getList(CodeConditionDTO conditionDTO);
}
