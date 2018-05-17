package io.kbdhunters.board.dto;

import io.kbdhunters.common.dto.ConditionDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jason, Moon
 * @since 2018-05-17.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BoardConditionDTO extends ConditionDTO {

    private String conBoardId;
}
