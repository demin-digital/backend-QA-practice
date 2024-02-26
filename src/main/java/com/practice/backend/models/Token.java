package com.practice.backend.models;

import javax.persistence.*;

@Entity
@Table(name = "tokens")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private Long userId;

    private String value;


    public Token (Token token) {
        this.userId = token.getUserId();
        this.tokenId = token.getTokenId();
        this.value = token.getValue();
    }

    public Token() {

    }

    public Long getTokenId() {
        return tokenId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
