package com.carwash.service;

import com.carwash.domain.User;
import com.carwash.repository.UserRepository;
import com.carwash.service.exception.BusinessRuleViolationException;
import com.carwash.service.exception.ResourceNotFoundException;

import java.util.List;

public class UserManagementService {

    private final UserRepository userRepository;

    public UserManagementService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        validateUser(user);
        userRepository.findByEmail(user.getEmail())
                .ifPresent(existing -> { throw new BusinessRuleViolationException("User email already exists"); });
        userRepository.save(user);
        return user;
    }

    public User findById(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found: " + userId));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        User existing = findById(user.getUserId());
        validateUser(user);
        userRepository.findByEmail(user.getEmail()).ifPresent(match -> {
            if (!match.getUserId().equals(existing.getUserId())) {
                throw new BusinessRuleViolationException("User email already exists");
            }
        });
        existing.updateProfile(user.getFullName(), user.getEmail(), user.getPhone());
        existing.setRole(user.getRole());
        userRepository.save(existing);
        return existing;
    }

    public void deleteUser(String userId) {
        findById(userId);
        userRepository.delete(userId);
    }

    private void validateUser(User user) {
        if (user == null) throw new BusinessRuleViolationException("User is required");
        if (isBlank(user.getEmail())) throw new BusinessRuleViolationException("Email must not be blank");
        if (isBlank(user.getFullName())) throw new BusinessRuleViolationException("Full name must not be blank");
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }
}
