package io.kbdhunters.menu.dto;

import io.kbdhunters.common.dto.ConditionDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jason, Moon
 * @since 2018-05-12.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MenuConditionDTO extends ConditionDTO {

    private String conParMenuId;
}
