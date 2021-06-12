package com.example.AF_Final.service;

import com.example.AF_Final.model.Course;
import com.example.AF_Final.model.Subjects;
import com.example.AF_Final.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

}
