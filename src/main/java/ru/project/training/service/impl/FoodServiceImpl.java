package ru.project.training.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.training.entity.Food;
import ru.project.training.repository.FoodRepository;
import ru.project.training.service.FoodService;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    private FoodRepository foodRepository;

    @Autowired
    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public Food save(Food food) {
        return foodRepository.save(food);
    }
}
