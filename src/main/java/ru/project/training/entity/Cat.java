package ru.project.training.entity;

import lombok.Getter;
import lombok.Setter;

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
