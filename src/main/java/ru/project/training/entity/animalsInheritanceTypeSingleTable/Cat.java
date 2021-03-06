package ru.project.training.entity.animalsInheritanceTypeSingleTable;

import lombok.Getter;
import lombok.Setter;
import ru.project.training.entity.Student;
import ru.project.training.entity.animalsInheritanceTypeSingleTable.Animal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Cat extends Animal {
    @Column(name = "height")
    private int height;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
