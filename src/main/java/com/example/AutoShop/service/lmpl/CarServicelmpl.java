package com.example.AutoShop.service.lmpl;

import com.example.AutoShop.mapper.CarMapper;
import com.example.AutoShop.model.dto.CarRequest;
import com.example.AutoShop.model.dto.CarResponse;
import com.example.AutoShop.model.entity.Car;
import com.example.AutoShop.repository.mapper.CarRepository;
import com.example.AutoShop.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CarServicelmpl implements CarService {

    private final CarMapper carMapper;
    private final CarRepository carRepository;


    @Override
    public List<CarResponse> getAllCars() {
        List<Car> carList = carRepository.findAll();
        List<CarResponse> carResponseList = carMapper.toCarResponseList(carList);
        return carResponseList;
    }

    @Override
    public CarResponse getByCar(Long id) {
        Optional<Car>  carOptional =  carRepository.findById(id);

        return carOptional.map(carMapper::toCarResponse).orElse(null);
    }

    @Override
    public void addCar(CarRequest carRequest) {
        Car car  = carMapper.toCar(carRequest);
        carRepository.insert(car);
    }

    @Override
    public void updateCar(Long id, CarRequest carRequest) {
     Car car = carMapper.toCar(id, carRequest);
     carRepository.update(car);
    }

    @Override
    public void updateCarPrice(Long id, Integer price) {
        carRepository.updatePrice(id, price);
    }

    @Override
    public void deleteCar(Long id) {
    carRepository.delete(id);
    }
}
