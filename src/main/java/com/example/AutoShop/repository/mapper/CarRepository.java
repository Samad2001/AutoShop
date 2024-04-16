package com.example.AutoShop.repository.mapper;

import com.example.AutoShop.model.entity.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CarRepository {

    List<Car> findAll();
    Optional<Car> findById(@Param("id") Long id);
    void insert(Car car);
    void update(Car car);
    void updatePrice(@Param("id") Long id, @Param("price") Integer price);
    void delete(@Param("id") Long id);

}
