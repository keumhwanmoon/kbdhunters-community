package io.kbdhunters.code.dto;

import io.kbdhunters.common.dto.ConditionDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jason, Moon
 * @since 2018-03-31.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CodeConditionDTO extends ConditionDTO {

    private String conCodeId;
    private String conCodeNm;
}
