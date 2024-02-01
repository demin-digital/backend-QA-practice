package com.practice.backend.component;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;


public class CorsFilter extends OncePerRequestFilter {
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // Добавление заголовка к каждому ответу
       
        response.addHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.addHeader("pragma", "no-cache-shashe");
        response.addHeader("Access-Control-Allow-Origin", "*");
        filterChain.doFilter(request, response);
    }
}