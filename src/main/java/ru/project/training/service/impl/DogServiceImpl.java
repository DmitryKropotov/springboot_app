package ru.project.training.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.training.entity.Dog;
import ru.project.training.repository.DogRepository;
import ru.project.training.service.DogService;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    private DogRepository dogRepository;

    @Autowired
    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<Dog> findAll() {
        return dogRepository.findAll();
    }

    @Override
    public Dog save(Dog dog) {
        return dogRepository.save(dog);
    }
}
