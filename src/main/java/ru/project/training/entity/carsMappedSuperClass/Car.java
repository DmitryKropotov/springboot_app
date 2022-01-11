package ru.project.training.entity.carsMappedSuperClass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class Car {
    @Id
    private int id;
    private String color;
}
