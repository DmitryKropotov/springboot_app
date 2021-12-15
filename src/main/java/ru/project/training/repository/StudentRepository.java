package ru.project.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
