package com.example.jwt.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {


    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.builder().username("admin")
                .password(passwordEncoder().encode("admin")).roles("ADMIN").build();
        UserDetails user2 = User.builder().username("hiten")
                .password(passwordEncoder().encode("hiten")).roles("ADMIN").build();

        return new InMemoryUserDetailsManager(user,user2);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
