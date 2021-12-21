package ru.project.training.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Dog extends Animal {
    @Column(name = "size")
    int size;
}
