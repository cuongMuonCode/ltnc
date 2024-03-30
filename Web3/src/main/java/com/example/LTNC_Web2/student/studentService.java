package com.example.LTNC_Web2.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    @Autowired
    private studentRepository studentRepository;

    public List<student> allStudent(){
        return  studentRepository.findAll();
    }
    // add one student
    public student addStudent( student students){
        studentRepository.save(students);
        return students;
    }
    // get one student

    public student getOneStudent(Integer id){
        return studentRepository.findStudentByStudentId(id);
    }

    // delete one student

    public student deleteStudent(Integer id){
         return studentRepository.deleteStudentByStudentId(id);
    }


}
