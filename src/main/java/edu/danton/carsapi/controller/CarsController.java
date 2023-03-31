package edu.danton.carsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.danton.carsapi.dto.CarDTO;
import edu.danton.carsapi.model.Car;
import edu.danton.carsapi.repository.CarRepository;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
  @Autowired
  private CarRepository repository;

  @GetMapping
  public List<Car> listAllCars() {
    return repository.findAll();
  }

  @PostMapping
  public void createCar(@RequestBody CarDTO car) {
    repository.save(new Car(car));
  }
}
