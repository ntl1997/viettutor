package com.fpoly.spring_BE.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // private final UserDetailsService userDetailsService;

    // public SecurityConfig(UserDetailsService userDetailsService) {
    // this.userDetailsService = userDetailsService;
    // }

    // @Bean
    // public AuthenticationManager authManager(HttpSecurity http) throws Exception
    // {
    // AuthenticationManagerBuilder authBuilder =
    // http.getSharedObject(AuthenticationManagerBuilder.class);
    // authBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    // return authBuilder.build();
    // }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // Sử dụng BCryptPasswordEncoder để mã hóa mật khẩu
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Tắt CSRF (Cross-Site Request Forgery)
                .authorizeHttpRequests(auth -> auth // Cấu hình phân quyền cho các request
                        .anyRequest().permitAll()); // Tất cả các request khác đều được phép truy cập
        return http.build();
    }

}
