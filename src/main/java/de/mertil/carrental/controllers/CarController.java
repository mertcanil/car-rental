package de.mertil.carrental.controllers;

import de.mertil.carrental.models.Car;
import de.mertil.carrental.services.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    // GET http://localhost:8080/cars -> return all cars if not rented
    @GetMapping
    public List<Car> getNotRentedCars() {
        return carService.findIfNotRented();
    }

    // GET http://localhost:8080/cars/all -> return all cars
    @GetMapping("/all")
    public List<Car> getCars() {
        return carService.findAll();
    }

    // POST http://localhost:8080/cars -> save new car
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void saveCar(@RequestBody Car car) {
        carService.save(car);
    }
}
