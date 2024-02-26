package com.practice.backend.services;

import com.practice.backend.repositories.TokenRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JwtTokenProviderService {

    private final TokenRepository tokenRepository;

    @Autowired
    public JwtTokenProviderService(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    private SecretKey jwtSecret = Keys.secretKeyFor(SignatureAlgorithm.HS512);

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    public String getToken (Long userId) {
        return tokenRepository.findByUserId(userId).getValue();
    }
}
