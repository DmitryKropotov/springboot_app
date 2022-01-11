package ru.project.training.service.cars.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.training.entity.carsMappedSuperClass.Bmw;
import ru.project.training.repository.cars.BmwRepository;
import ru.project.training.service.cars.BmwService;

import java.util.List;

@Service
public class BmwServiceImpl implements BmwService {

    private BmwRepository bmwRepository;

    @Autowired
    public BmwServiceImpl(BmwRepository bmwRepository) {
        this.bmwRepository = bmwRepository;
    }

    @Override
    public List<Bmw> findAll() {
        return bmwRepository.findAll();
    }

    @Override
    public Bmw save(Bmw bmw) {
        return bmwRepository.save(bmw);
    }
}
