package ru.project.training.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.training.entity.Cat;
import ru.project.training.repository.CatRepository;
import ru.project.training.service.CatService;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {

    private CatRepository catRepository;

    @Autowired
    public CatServiceImpl(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public List<Cat> findAll() {
        return catRepository.findAll();
    }

    @Override
    public Cat save(Cat cat) {
        return catRepository.save(cat);
    }
}
