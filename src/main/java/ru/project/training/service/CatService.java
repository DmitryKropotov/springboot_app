package ru.project.training.service;

import ru.project.training.entity.Cat;

import java.util.List;

public interface CatService {
    List<Cat> findAll();
    Cat save(Cat cat);
}
