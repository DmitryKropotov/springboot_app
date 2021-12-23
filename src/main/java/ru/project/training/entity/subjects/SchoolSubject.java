package ru.project.training.entity.subjects;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "schoolId")
public class SchoolSubject extends Subject {
    private int school;
}
