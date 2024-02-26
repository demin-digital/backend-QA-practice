package com.practice.backend.services;

import com.practice.backend.models.Token;
import com.practice.backend.models.UserInfo;
import com.practice.backend.repositories.TokenRepository;
import com.practice.backend.repositories.UserInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private final UserInfoRepository userInfoRepository;
    private final TokenRepository tokenRepository;

    public ProfileService(UserInfoRepository userInfoRepository, TokenRepository tokenRepository) {
        this.userInfoRepository = userInfoRepository;
        this.tokenRepository = tokenRepository;
    }


    public UserInfo getUserProfile(String tokenValue) {
        Long userId = tokenRepository.findByValue(tokenValue).getUserId();
        return userInfoRepository.findByUserId(userId);
    }
}
