package com.example.LTNC_Web2.courseDone;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseDoneRepository extends MongoRepository<courseDone,Integer> {
    public courseDone findCourseDoneByStudentId(Integer studentId);
    public courseDone deleteCourseDoneByStudentId(Integer studentId);
}
