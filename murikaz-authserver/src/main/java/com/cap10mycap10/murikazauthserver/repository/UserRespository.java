package com.cap10mycap10.murikazauthserver.repository;

import com.cap10mycap10.murikazauthserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {
}
