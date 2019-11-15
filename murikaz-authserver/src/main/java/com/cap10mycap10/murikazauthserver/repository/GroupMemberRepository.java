package com.cap10mycap10.murikazauthserver.repository;

import com.cap10mycap10.murikazauthserver.model.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMemberRepository extends JpaRepository<GroupMember, Long> {
}
