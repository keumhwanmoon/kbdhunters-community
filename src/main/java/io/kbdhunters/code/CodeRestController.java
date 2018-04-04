package io.kbdhunters.code;

import io.kbdhunters.code.dto.CodeConditionDTO;
import io.kbdhunters.code.service.CodeService;
import io.kbdhunters.common.vo.ResponseVO;
import io.kbdhunters.common.vo.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason, Moon
 * @since 2018-03-31.
 */
@RestController
public class CodeRestController {

    private final CodeService codeService;

    @Autowired
    public CodeRestController(CodeService codeService) {
        this.codeService = codeService;
    }

    @GetMapping("/api/code/getTree")
    public ResponseVO getCodeList(CodeConditionDTO codeConditionDTO) {
        return ResponseVO.of(ResultCode.SUCCESS, codeService.getList(codeConditionDTO));
    }
}
