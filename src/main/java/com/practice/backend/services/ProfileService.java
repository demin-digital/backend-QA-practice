package com.practice.backend.services;

import com.practice.backend.models.UserInfo;
import com.practice.backend.repositories.UserInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private final UserInfoRepository userInfoRepository;

    public ProfileService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }


    public UserInfo getUserProfile(String tokenValue) {
        //TODO: нужно переделать, чтобы забирался не по токену юзер, а по айди из юзеринфо репозитория видимо
//        Long userId = tokenRepository.findByValue(tokenValue).getUserId();
//        return userInfoRepository.findByUserId(userId);
        return null;
    }
}
