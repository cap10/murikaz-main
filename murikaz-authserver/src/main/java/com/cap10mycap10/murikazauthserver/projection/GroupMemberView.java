package com.cap10mycap10.murikazauthserver.projection;

import com.cap10mycap10.murikazauthserver.model.GroupMember;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = GroupMember.class)
public class GroupMemberView {
}
