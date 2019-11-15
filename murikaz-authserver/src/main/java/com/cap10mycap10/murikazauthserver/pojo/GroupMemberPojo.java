package com.cap10mycap10.murikazauthserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupMemberPojo {
    private String username;
    private Long groupId;
}
