package ru.project.training.entity;

import javax.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animalNumber",
  discriminatorType = DiscriminatorType.INTEGER)
public class Animal {
    @Id
    int id;
    String name;
}
