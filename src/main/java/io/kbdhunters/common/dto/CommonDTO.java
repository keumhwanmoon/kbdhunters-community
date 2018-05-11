package io.kbdhunters.common.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Jason, Moon
 * @since 2018-03-31.
 */
@Data
public class CommonDTO {

    private String registerUserId;
    private String registerUserIp;
    private LocalDateTime registerDate;

    private String updateUserId;
    private String updateUserIp;
    private LocalDateTime updateDate;

    private String currentUserId;
    private String currentUserIp;
}
