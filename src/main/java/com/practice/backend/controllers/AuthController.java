package com.practice.backend.controllers;
import com.practice.backend.models.UserInfo;
import com.practice.backend.models.requestEntities.AuthRequest;
import com.practice.backend.models.responseEntities.AuthResponse;
import com.practice.backend.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;


    @Autowired
    public AuthController(AuthService authService) {
        //TODO: проверить что тут ок
        this.authService = authService;
    }

    @PostMapping("/auth")
    public ResponseEntity<AuthResponse> authenticate(@RequestBody AuthRequest request) {
        UserInfo authenticatedUser = authService.authenticate(request.getUsername(), request.getPassword());

        if (authenticatedUser.hasData()) {
            AuthResponse response = new AuthResponse(true, "Авторизация успешна!");
            return ResponseEntity.ok(response);
        } else {
            AuthResponse response = new AuthResponse(false, "Неверные учетные данные");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }
}

