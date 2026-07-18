package com.familybudget.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.familybudget.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}