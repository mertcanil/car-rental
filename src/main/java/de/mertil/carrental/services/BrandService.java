package de.mertil.carrental.services;

import de.mertil.carrental.models.Brand;
import de.mertil.carrental.repositorys.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    public Brand findByName(String name) {
        return brandRepository.findByName(name);
    }

    public void save(Brand brand) {
        brandRepository.save(brand);
    }

    public void deleteById(Long id) {
        brandRepository.deleteById(id);
    }
}
