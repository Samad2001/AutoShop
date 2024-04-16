package com.example.AutoShop.controller;


import com.example.AutoShop.model.dto.CarRequest;
import com.example.AutoShop.model.dto.CarResponse;
import com.example.AutoShop.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auto-car")
public class CarController {

    private final CarService carService;

    @GetMapping("/no-auth")
    public ResponseEntity<List<CarResponse>> getAllCars(){
        List<CarResponse> carResponseList = carService.getAllCars();
        return ResponseEntity.ok(carResponseList);
    }

    @GetMapping("/no-auth/id{id}")
    public ResponseEntity<CarResponse> getCarById(@PathVariable("id") Long id){
        CarResponse carResponse = carService.getByCar(id);
        return ResponseEntity.ok(carResponse);
    }


    @PostMapping
    public ResponseEntity<Void> addCar(@RequestBody CarRequest carRequest){
        carService.addCar(carRequest);
        return ResponseEntity.ok().build();
    }


    @PutMapping("/id/{id}")
    public ResponseEntity<Void> updateCar(@PathVariable Long id,
                                          @RequestBody CarRequest carRequest){
        carService.updateCar(id, carRequest);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/id/{id}")
    public ResponseEntity<Void>  updateCarPrice(@PathVariable Long id,
                                                @RequestParam Integer price){
        carService.updateCarPrice(id, price);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/admin/id/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
        return ResponseEntity.ok().build();
    }


}
