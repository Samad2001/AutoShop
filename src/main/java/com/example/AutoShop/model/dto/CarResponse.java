package com.example.AutoShop.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarResponse {

    private Long id;
    private String brand;
    private String model;
    private Integer price;
    private Integer distance;
    private Integer age;
}
