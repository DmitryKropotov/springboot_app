package ru.project.training.entity.subjects;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class UniversitySubject extends Subject {
    private String university;
}
