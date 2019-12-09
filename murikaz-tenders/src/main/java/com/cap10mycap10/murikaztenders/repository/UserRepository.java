package com.cap10mycap10.murikaztenders.repository;

import com.cap10mycap10.murikaztenders.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
