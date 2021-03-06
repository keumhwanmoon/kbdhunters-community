package io.kbdhunters.code.dto;

import io.kbdhunters.common.dto.TreeDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jason, Moon
 * @since 2018-03-31.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CodeDTO extends TreeDTO {

    private String codeId;
    private String codeNm;
    private String codeVar;
    private String codeExpl;
}
