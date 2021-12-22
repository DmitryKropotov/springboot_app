package ru.project.training.service.cars.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.training.entity.cars.Mersedes;
import ru.project.training.repository.cars.MersedesRepository;
import ru.project.training.service.cars.MersedesService;

import java.util.List;

@Service
public class MersedesServiceImpl implements MersedesService {

    private MersedesRepository mersedesRepository;

    @Autowired
    public MersedesServiceImpl(MersedesRepository mersedesRepository) {
        this.mersedesRepository = mersedesRepository;
    }

    @Override
    public List<Mersedes> findAll() {
        return mersedesRepository.findAll();
    }

    @Override
    public Mersedes save(Mersedes mersedes) {
        return mersedesRepository.save(mersedes);
    }
}
