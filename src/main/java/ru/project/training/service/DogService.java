package ru.project.training.service;

import ru.project.training.entity.animalsInheritanceTypeSingleTable.Dog;

import java.util.List;

public interface DogService {
    List<Dog> findAll();
    Dog save(Dog dog);
}
