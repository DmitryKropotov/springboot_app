package ru.project.training.service.transport;

import ru.project.training.entity.transportInheritanceTablePerClass.Transport;

import java.util.List;

public interface TransportService<T extends Transport> {
    List<T> findAll();
    T save(T subject);
}
