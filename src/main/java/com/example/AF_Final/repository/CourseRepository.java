package com.example.AF_Final.repository;

import com.example.AF_Final.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository  extends MongoRepository<Course, Object> {

}

