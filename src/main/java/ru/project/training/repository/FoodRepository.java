package ru.project.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {
}
