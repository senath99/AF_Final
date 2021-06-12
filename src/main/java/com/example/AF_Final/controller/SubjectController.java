package com.example.AF_Final.controller;

import com.example.AF_Final.model.Subjects;
import com.example.AF_Final.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class SubjectController {

    private final SubjectService subjectService;
    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping("/registerSubject")
    public ResponseEntity<?> createVehicle(@RequestBody Subjects subjects) {
        return new ResponseEntity<>(subjectService.createSubject(subjects), HttpStatus.CREATED);
    }

    @GetMapping("/getSubjects")
    public ResponseEntity<?> getCourses() {
        return new ResponseEntity<>(subjectService.getSubject(), HttpStatus.ACCEPTED);
    }
}
