package com.jihyun.my.repository;

import com.jihyun.my.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
