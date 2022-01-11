package ru.project.training.service.subjects.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.training.entity.subjectsInheritanceTypeJoined.SchoolSubject;
import ru.project.training.repository.subjects.SchoolSubjectRepository;
import ru.project.training.service.subjects.SchoolSubjectService;

import java.util.List;

@Service
public class SchoolSubjectServiceImpl implements SchoolSubjectService {

    private SchoolSubjectRepository schoolSubjectRepository;

    @Autowired
    public SchoolSubjectServiceImpl(SchoolSubjectRepository schoolSubjectRepository) {
        this.schoolSubjectRepository = schoolSubjectRepository;
    }

    @Override
    public List<SchoolSubject> findAll() {
        return schoolSubjectRepository.findAll();
    }

    @Override
    public SchoolSubject save(SchoolSubject subject) {
        return schoolSubjectRepository.save(subject);
    }
}
