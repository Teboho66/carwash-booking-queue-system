package com.carwash.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI carwashOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Car Wash Booking and Queue Management API")
                .version("1.0")
                .description("REST API for managing users, vehicles, car wash services, bookings, and queue entries."));
    }
}
