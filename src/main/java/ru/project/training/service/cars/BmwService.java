package ru.project.training.service.cars;

import ru.project.training.entity.carsMappedSuperClass.Bmw;

import java.util.List;

public interface BmwService {
    List<Bmw> findAll();
    Bmw save(Bmw bmw);
}
