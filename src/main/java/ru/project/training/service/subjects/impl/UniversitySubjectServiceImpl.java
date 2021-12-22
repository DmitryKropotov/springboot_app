package ru.project.training.service.subjects.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.training.entity.subjects.SchoolSubject;
import ru.project.training.entity.subjects.UniversitySubject;
import ru.project.training.repository.subjects.SchoolSubjectRepository;
import ru.project.training.repository.subjects.UniversitySubjectRepository;
import ru.project.training.service.subjects.UniversitySubjectService;

import java.util.List;

@Service
public class UniversitySubjectServiceImpl implements UniversitySubjectService {

    private UniversitySubjectRepository universitySubjectRepository;

    @Autowired
    public UniversitySubjectServiceImpl(UniversitySubjectRepository universitySubjectRepository) {
        this.universitySubjectRepository = universitySubjectRepository;
    }

    @Override
    public List<UniversitySubject> findAll() {
        return universitySubjectRepository.findAll();
    }

    @Override
    public UniversitySubject save(UniversitySubject subject) {
        return universitySubjectRepository.save(subject);
    }
}
