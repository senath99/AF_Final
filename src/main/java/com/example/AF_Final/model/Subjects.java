package com.example.AF_Final.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Document
public class Subjects {

    private String value;
    private String description;
    private double price;
}
