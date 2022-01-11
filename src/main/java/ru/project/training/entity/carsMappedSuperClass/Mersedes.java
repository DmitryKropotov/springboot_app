package ru.project.training.entity.carsMappedSuperClass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Mersedes extends Car {
    private int wheels;
}
