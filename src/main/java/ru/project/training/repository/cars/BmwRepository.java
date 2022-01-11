package ru.project.training.repository.cars;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.carsMappedSuperClass.Bmw;

public interface BmwRepository extends JpaRepository<Bmw, Integer> {
}
