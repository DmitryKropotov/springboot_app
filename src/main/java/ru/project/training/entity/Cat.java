package ru.project.training.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Cat extends Animal {
    @Column(name = "height")
    int height;
}
