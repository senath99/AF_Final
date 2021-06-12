package com.example.AF_Final.model;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Document
public class Course {
    private String name;
    private String capacity;
    private String description;
    private Object subjects[];
}
