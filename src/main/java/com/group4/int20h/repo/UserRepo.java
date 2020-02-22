package com.group4.int20h.repo;

import com.group4.int20h.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
  Optional<User> findByEmailAndPassword(String email, String password);
}
