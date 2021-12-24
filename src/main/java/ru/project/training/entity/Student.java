package ru.project.training.entity;

import lombok.*;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Auditable<String> {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @OneToMany(targetEntity = Food.class, mappedBy = "studentId")
    @Fetch(FetchMode.SELECT)
    @BatchSize(size = 1)
    private List<Food> food;
}
