package com.webreview.webreviewapp.repository;

import com.webreview.webreviewapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
