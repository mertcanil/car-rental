package de.mertil.carrental.services;

import de.mertil.carrental.models.Car;
import de.mertil.carrental.repositorys.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public List<Car> findIfNotRented() {
        return carRepository.findByRented(false);
    }

    public void save(Car car) {
        carRepository.save(car);
    }

    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }
}
