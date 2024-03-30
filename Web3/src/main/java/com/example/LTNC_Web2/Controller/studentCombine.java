package com.example.LTNC_Web2.Controller;

import com.example.LTNC_Web2.courseDone.courseDoneService;
import com.example.LTNC_Web2.information.information;
import com.example.LTNC_Web2.information.informationService;
import com.example.LTNC_Web2.student.student;
import com.example.LTNC_Web2.student.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/combine")
public class studentCombine {

    @Autowired
    private studentService studentService;
    @Autowired
    private informationService informationService;
    @Autowired
    private courseDoneService courseDoneService;

    @GetMapping("/all")
    public ResponseEntity<List<student>> AllStudent() {
        return new ResponseEntity<List<student>>(studentService.allStudent(), HttpStatus.OK);
    }
    @GetMapping("/student/{studentId}") // xem student
    public student getStudentById(@PathVariable Integer studentId){
          return studentService.getOneStudent(studentId);
    }

    @PostMapping("/student/addStudents")// add moi 1 hoc sinh
    public void createNewStudent(){
         studentService.addStudent(new student(10));
         informationService.addInformationById(10,"HUY","huy khac");
         courseDoneService.createNewCourseDone(10);
   }
    @DeleteMapping("/student/deleteStudent/{studentId}")// chua xoa list mon hoc
    public void deleteStudentById(@PathVariable Integer studentId){
        studentService.deleteStudent(studentId);
        informationService.deleteStudentById(studentId);
    }
    // chinh sua thon tin ca nhan
    @PutMapping("/student/updateInformation")// sua thong tin
    public void updateNameStudentInformation(){// update ten theo id
        informationService.updateName("rename",1122);
    }
    // nhan diem tu giao vien
    @PutMapping("/student/returnGPA")
    public void returnGpaToStudent(){
        String courseName="GT1";
        Double gpaOfthisCourse = 3.4;
        Integer studentIdWantToReturnGpa= 10;// dua diem cho ban co id la 10
        courseDoneService.returnGpaInCourse(studentIdWantToReturnGpa,courseName,gpaOfthisCourse);
    }

    // dang ky khoa hoc
























}
