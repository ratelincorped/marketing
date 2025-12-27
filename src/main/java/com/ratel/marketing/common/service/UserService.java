package com.ratel.marketing.common.service;

import com.ratel.marketing.common.model.User;
import com.ratel.marketing.common.repository.CommentRepository;
import com.ratel.marketing.common.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public record UserService(UserRepository userRepository) {
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Optional<User> getUserById(Integer userId) {
        return userRepository.findById(userId);
    }
    public List<User> getUserByUsername(String username) {
        return userRepository.findAllByUsername(username);
    }
    public List<User> getUserByName(String name) {
        return userRepository.findAllByName(name);
    }
}
