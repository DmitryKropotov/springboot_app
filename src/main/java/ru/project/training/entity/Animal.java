package ru.project.training.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animalNumber",
  discriminatorType = DiscriminatorType.INTEGER)
@Getter
@Setter
public class Animal {
    @Id
    int id;
    String name;
}
