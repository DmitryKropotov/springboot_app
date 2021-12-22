package ru.project.training.service.subjects;

import ru.project.training.entity.subjects.SchoolSubject;

import java.util.List;

public interface SchoolSubjectService {
    List<SchoolSubject> findAll();
    SchoolSubject save(SchoolSubject subject);
}
