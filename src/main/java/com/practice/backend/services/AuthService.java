package com.practice.backend.services;

import com.practice.backend.models.UserInfo;
import com.practice.backend.repositories.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserInfoRepository userInfoRepository;
    @Autowired
    public AuthService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    public UserInfo authenticate(String username, String password) {
        return userInfoRepository.findByUsernameAndPassword(username, password);
    }
}
