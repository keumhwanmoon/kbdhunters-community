package io.kbdhunters.board.dto;

import io.kbdhunters.common.dto.CommonDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jason, Moon
 * @since 2018-05-17.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BoardPostDTO extends CommonDTO {

    private String boardId;

    private String subject;
    private String categoryId;
    private String categoryName;
    private String contents;
    private int hitCount;
    private int recommendCount;
}
