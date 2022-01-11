package ru.project.training.service.cars;

import ru.project.training.entity.carsMappedSuperClass.Mersedes;

import java.util.List;

public interface MersedesService {
    List<Mersedes> findAll();
    Mersedes save(Mersedes mersedes);
}
