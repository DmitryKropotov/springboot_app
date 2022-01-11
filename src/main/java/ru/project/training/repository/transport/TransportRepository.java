package ru.project.training.repository.transport;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.transportInheritanceTablePerClass.Transport;

public interface TransportRepository<T extends Transport> extends JpaRepository<T, Integer> {
}
