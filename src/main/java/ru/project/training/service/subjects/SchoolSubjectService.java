package ru.project.training.service.subjects;

import ru.project.training.entity.subjectsInheritanceTypeJoined.SchoolSubject;

import java.util.List;

public interface SchoolSubjectService {
    List<SchoolSubject> findAll();
    SchoolSubject save(SchoolSubject subject);
}
