package de.mertil.carrental.services;

import de.mertil.carrental.models.CarType;
import de.mertil.carrental.repositorys.CarTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarTypeService {

    private final CarTypeRepository carTypeRepository;

    public CarTypeService(CarTypeRepository carTypeRepository) {
        this.carTypeRepository = carTypeRepository;
    }

    public List<CarType> findAll() {
        return carTypeRepository.findAll();
    }

    public CarType findByName(String name) {
        return carTypeRepository.findByName(name);
    }

    public void save(CarType carType) {
        carTypeRepository.save(carType);
    }

    public void deleteById(Long id) {
        carTypeRepository.deleteById(id);
    }
}
