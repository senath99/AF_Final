package com.example.AF_Final.service;

import com.example.AF_Final.model.Subjects;
import com.example.AF_Final.repository.SubjectRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }
    public Subjects createSubject(Subjects subjects) {
        return subjectRepository.save(subjects);
    }

    public List<Subjects> getSubject() {
        return subjectRepository.findAll();
    }
}
