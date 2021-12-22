package ru.project.training.service.cars;

import ru.project.training.entity.cars.Mersedes;

import java.util.List;

public interface MersedesService {
    List<Mersedes> findAll();
    Mersedes save(Mersedes mersedes);
}
