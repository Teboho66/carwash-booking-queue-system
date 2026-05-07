package com.carwash.repository;

import com.carwash.domain.User;

import java.util.Optional;

public interface UserRepository extends Repository<User, String>{
    Optional<User> findByEmail(String email);
}
