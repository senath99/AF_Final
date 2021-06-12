package com.example.AF_Final.controller;

import com.example.AF_Final.model.Course;
import com.example.AF_Final.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class CourseController {

    private final CourseService courseService;
    @Autowired
    public CourseController(CourseService vehicleService, CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/registerCourse")
    public ResponseEntity<?> createVehicle(@RequestBody Course course) {
        return new ResponseEntity<>(courseService.createCourse(course), HttpStatus.CREATED);
    }

    @GetMapping("/getCourses")
    public ResponseEntity<?> retrieveWorkshops() {
        return new ResponseEntity<>(courseService.getCourses(), HttpStatus.ACCEPTED);
    }
}
