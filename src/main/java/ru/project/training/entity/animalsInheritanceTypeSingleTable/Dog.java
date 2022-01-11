package ru.project.training.entity.animalsInheritanceTypeSingleTable;

import lombok.Getter;
import lombok.Setter;
import ru.project.training.entity.animalsInheritanceTypeSingleTable.Animal;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Dog extends Animal {
    @Column(name = "size")
    int size;
}
