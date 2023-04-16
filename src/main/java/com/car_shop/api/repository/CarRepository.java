package com.car_shop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car_shop.api.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
  
}
