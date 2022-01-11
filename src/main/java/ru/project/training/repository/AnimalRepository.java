package ru.project.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.animalsInheritanceTypeSingleTable.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
