package ru.project.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.Dog;

public interface DogRepository extends JpaRepository<Dog, Integer> {
}
