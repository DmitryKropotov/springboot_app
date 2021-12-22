package ru.project.training.repository.subjects;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.subjects.UniversitySubject;

public interface UniversitySubjectRepository extends JpaRepository<UniversitySubject, Integer> {
}
