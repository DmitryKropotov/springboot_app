package ru.project.training.service;

import ru.project.training.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student save(Student student);
}
