package io.kbdhunters.code.service;

import io.kbdhunters.code.dto.CodeConditionDTO;
import io.kbdhunters.code.dto.CodeDTO;
import io.kbdhunters.code.mapper.CodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2018-03-31.
 */
@Service
public class CodeServiceImpl implements CodeService {
    private final CodeMapper codeMapper;

    @Autowired
    public CodeServiceImpl(CodeMapper codeMapper) {
        this.codeMapper = codeMapper;
    }

    @Override
    public List<CodeDTO> getList(CodeConditionDTO codeConditionDTO) {
        return codeMapper.getList(codeConditionDTO);
    }
}
