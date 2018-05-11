package io.kbdhunters.menu.dto;

import io.kbdhunters.common.dto.CommonDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jason, Moon
 * @since 2018-05-12.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MenuDTO extends CommonDTO {

    private String menuId;
    private String menuNm;
    private String menuExpl;
    private int sortNo;
}
