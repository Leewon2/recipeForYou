package com.recipeForYou.backend.domain.user.controller;

import com.recipeForYou.backend.domain.user.domain.User;
import com.recipeForYou.backend.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/user")
public class userController {
    private final UserService userService;

    @GetMapping("/{nickname}")
    public ResponseEntity<?> login(@PathVariable String nickname){
        User user = userService.signup(nickname);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
