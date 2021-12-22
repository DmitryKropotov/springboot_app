package ru.project.training.entity.cars;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Bmw extends Car {
    private int gas;
}
