package com.example.springvalidation.service;

import com.example.springvalidation.entity.User;
import com.example.springvalidation.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @author manhdt14
 * created in 10/6/2023 7:30 AM
 */
@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
