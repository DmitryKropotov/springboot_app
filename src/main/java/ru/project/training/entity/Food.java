package ru.project.training.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Food {
    @Id
    private int id;
    private String name;
    private int studentId;
//    @ManyToOne
//    @JoinColumn(name = "student_id")
//    @Fetch(FetchMode.JOIN)
//    private Student student;
}
