package ru.project.training.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.training.entity.transportInheritanceTablePerClass.Transport;
import ru.project.training.repository.transport.TransportRepository;
import ru.project.training.service.transport.TransportService;

import java.util.List;

@Service
public class TransportServiceImpl<T extends Transport> implements TransportService<T> {
    private TransportRepository<T> transportRepository;

    @Autowired
    public TransportServiceImpl(TransportRepository<T> transportRepository) {
        this.transportRepository = transportRepository;
    }

    @Override
    public List<T> findAll() {
        return transportRepository.findAll();
    }

    @Override
    public T save(T transport) {
        return transportRepository.save(transport);
    }
}
