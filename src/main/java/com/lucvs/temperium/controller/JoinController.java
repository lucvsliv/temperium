package com.lucvs.temperium.controller;

import com.lucvs.temperium.dto.User;
import com.lucvs.temperium.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/join")
public class JoinController {

    public final UserService userService;

    public JoinController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> joinProcess(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
}
