package ru.project.training.service;

import ru.project.training.entity.animalsInheritanceTypeSingleTable.Cat;

import java.util.List;

public interface CatService {
    List<Cat> findAll();
    Cat save(Cat cat);
}
