package com.example.AutoShop.service;

import com.example.AutoShop.model.dto.CarRequest;
import com.example.AutoShop.model.dto.CarResponse;

import java.util.List;

public interface CarService {
    List<CarResponse> getAllCars();
    CarResponse getByCar(Long id);
    void addCar(CarRequest carRequest);
    void updateCar(Long id, CarRequest carRequest);
    void updateCarPrice(Long id, Integer price);
    void deleteCar(Long id);


}
