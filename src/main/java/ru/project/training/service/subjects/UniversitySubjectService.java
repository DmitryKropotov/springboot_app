package ru.project.training.service.subjects;

import ru.project.training.entity.subjects.UniversitySubject;

import java.util.List;

public interface UniversitySubjectService {
    List<UniversitySubject> findAll();
    UniversitySubject save(UniversitySubject bmw);
}
