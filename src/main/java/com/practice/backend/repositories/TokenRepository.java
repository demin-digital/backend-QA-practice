package com.practice.backend.repositories;

import com.practice.backend.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {

    Token findByUserId(@Param("user_id") Long userId);

    Token findByValue(@Param("value") String tokenValue);
}

