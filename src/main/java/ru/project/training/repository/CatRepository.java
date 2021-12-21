package ru.project.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.Cat;

public interface CatRepository extends JpaRepository<Cat, Integer> {
}
