package ru.project.training.repository.cars;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.carsMappedSuperClass.Mersedes;

public interface MersedesRepository extends JpaRepository<Mersedes, Integer> {
}
