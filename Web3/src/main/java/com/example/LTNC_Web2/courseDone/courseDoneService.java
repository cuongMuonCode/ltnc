package com.example.LTNC_Web2.courseDone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseDoneService {
    @Autowired
    private courseDoneRepository courseDoneRepository;

    public List<courseDone> getAllDone(){
        return courseDoneRepository.findAll();
    }
    // get one course done with id

    public courseDone getCourseDoneById(Integer id){
        return courseDoneRepository.findCourseDoneByStudentId(id);
    }

    // cho diem mon x


    public void createNewCourseDone(Integer id){
        courseDone course = new courseDone(id);
        courseDoneRepository.save(course);
    }

    public void returnGpaInCourse(Integer id, String courseName,Double gpa){
//        if(courseDoneRepository.deleteCourseDoneByStudentId(id)==null){
//            courseDone course= new courseDone(id);
//            course.addCourseDone(courseName,gpa);
//            return;
//        }
        courseDone thisCourse= courseDoneRepository.deleteCourseDoneByStudentId(id);
        thisCourse.addCourseDone(courseName,gpa);
        courseDoneRepository.save(thisCourse);
    }
}
