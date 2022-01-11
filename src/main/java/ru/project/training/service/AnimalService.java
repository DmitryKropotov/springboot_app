package ru.project.training.service;

import ru.project.training.entity.animalsInheritanceTypeSingleTable.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal> findAll();
    Animal save(Animal animal);
}
