package de.mertil.carrental.repositorys;

import de.mertil.carrental.models.CarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarTypeRepository extends JpaRepository<CarType, Long> {

    CarType findByName(String name);
}
