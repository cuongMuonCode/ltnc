package com.example.LTNC_Web2.courseDone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "learning")
public class courseDone {
    private Integer studentId;
    private List<String> doneList;
    private List<Double> courseGPA;

    courseDone(Integer studentId){
        this.studentId=studentId;
        doneList= new ArrayList<>();
        courseGPA= new ArrayList<>();
    }

   // private List<String> courseLearning;
    public void addCourseDone(String courseName,Double courseGPAs){
        doneList.add(courseName);
        courseGPA.add(courseGPAs);
    }

}
