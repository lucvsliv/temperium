package com.lucvs.temperium.service;

import com.lucvs.temperium.dto.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUserById(Long userId);
    User getUserByUsername(String username);
    List<User> getAllUsers();
    void deleteUser(Long userId);
}
