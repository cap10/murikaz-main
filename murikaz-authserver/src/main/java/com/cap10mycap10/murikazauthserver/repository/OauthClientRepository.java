package com.cap10mycap10.murikazauthserver.repository;

import com.cap10mycap10.murikazauthserver.model.OauthClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OauthClientRepository extends JpaRepository<OauthClient, Long> {
}
