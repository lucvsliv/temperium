package com.lucvs.tempesta.service;

import com.lucvs.tempesta.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUserById(Long userId);
    User getUserByUsername(String username);
    List<User> getAllUsers();
    void deleteUser(Long userId);
}
