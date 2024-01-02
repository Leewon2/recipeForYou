package com.recipeForYou.backend.domain.user.service;

import com.recipeForYou.backend.domain.user.domain.User;
import com.recipeForYou.backend.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public User signup(String nickname){
        User user = userRepository.findByNickname(nickname).orElseThrow(()
        -> new IllegalArgumentException("존재하지 않는 회원입니다."));

        return user;
    }


}
