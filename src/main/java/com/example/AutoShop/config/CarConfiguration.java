package com.example.AutoShop.config;

import com.example.AutoShop.mapper.CarMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {
    @Bean
    public CarMapper carMapper(){
        return CarMapper.INSTANCE;
    }
}

