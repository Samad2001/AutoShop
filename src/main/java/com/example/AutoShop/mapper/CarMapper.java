package com.example.AutoShop.mapper;

import com.example.AutoShop.model.dto.CarRequest;
import com.example.AutoShop.model.dto.CarResponse;
import com.example.AutoShop.model.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarMapper {

    CarMapper  INSTANCE = Mappers.getMapper(CarMapper.class);
    List<CarResponse>  toCarResponseList(List<Car> carList);
    CarResponse toCarResponse(Car car);
    Car  toCar(CarRequest carRequest);
    Car toCar(Long id,  CarRequest carRequest);



}
