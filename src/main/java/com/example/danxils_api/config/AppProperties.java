package com.example.danxils_api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppProperties {

    // Expiration times in milliseconds
    @Value("${app.jwt.accessTokenExpirationMs:600000}")      // 10 minutes
    private int accessTokenExpirationMs;

    @Value("${app.jwt.refreshTokenExpirationMs:1800000}")     // 30 minutes
    private int refreshTokenExpirationMs;

    // File storage path for orders
    @Value("${app.order.storage.path:/tmp/orders}")
    private String orderStoragePath;

    public int getAccessTokenExpirationMs() {
        return accessTokenExpirationMs;
    }

    public int getRefreshTokenExpirationMs() {
        return refreshTokenExpirationMs;
    }

    public String getOrderStoragePath() {
        return orderStoragePath;
    }
}
