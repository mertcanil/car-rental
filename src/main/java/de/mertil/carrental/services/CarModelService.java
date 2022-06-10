package de.mertil.carrental.services;

import de.mertil.carrental.models.CarModel;
import de.mertil.carrental.repositorys.CarModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelService {

    private CarModelRepository carModelRepository;

    public CarModelService(CarModelRepository carModelRepository) {
        this.carModelRepository = carModelRepository;
    }

    public List<CarModel> findAll() {
        return carModelRepository.findAll();
    }

    public void save(CarModel model) {
        carModelRepository.save(model);
    }

    public void deleteById(Long id) {
        carModelRepository.deleteById(id);
    }
}
