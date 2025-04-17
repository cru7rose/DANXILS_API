package com.example.danxils_api.config;

import com.example.danxils_api.service.JwtService;
import com.example.danxils_api.service.KeyManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @Bean
    public JwtService jwtService(AppProperties appProperties, KeyManager keyManager) {
        return new JwtService(appProperties, keyManager);
    }
}
