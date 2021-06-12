package com.example.AF_Final.repository;

import com.example.AF_Final.model.Subjects;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository  extends MongoRepository<Subjects, Object> {

}