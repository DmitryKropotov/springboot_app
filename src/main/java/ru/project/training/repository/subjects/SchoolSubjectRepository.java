package ru.project.training.repository.subjects;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.subjectsInheritanceTypeJoined.SchoolSubject;

public interface SchoolSubjectRepository extends JpaRepository<SchoolSubject, Integer> {
}
