package com.user.learning.user.repository;

import com.user.learning.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User getByUserId(Long id);
}
