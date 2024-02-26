package com.practice.backend.controllers;

import com.practice.backend.models.responseEntities.ProfileResponse;
import com.practice.backend.services.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping(value = "/info", produces = "application/json")
    public ResponseEntity<ProfileResponse> getUserInfo(@RequestHeader String token) {
        ProfileResponse response = new ProfileResponse(profileService.getUserProfile(token));
        return ResponseEntity.ok(response);
    }
}
