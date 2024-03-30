package com.example.LTNC_Web2.student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends MongoRepository<student,Integer> {

    public student findStudentByStudentId(Integer studentId);

    public student deleteStudentByStudentId(Integer id);
}
