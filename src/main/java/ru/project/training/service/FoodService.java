package ru.project.training.service;

import ru.project.training.entity.Food;

import java.util.List;

public interface FoodService {
    List<Food> findAll();
    Food save(Food food);
}
