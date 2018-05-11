package io.kbdhunters.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jason, Moon
 * @since 2018-05-12.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TreeDTO extends CommonDTO {

    private String nodeKey;
    private String title;
    private String parentNodeKey;
}
