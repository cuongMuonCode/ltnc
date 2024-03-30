//package com.example.LTNC_Web2.student;
//import com.example.LTNC_Web2.information.information;
//import com.example.LTNC_Web2.information.informationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping
//public class studentController {
//    @Autowired
//    private studentService studentService;
//
// //   @GetMapping
//    public ResponseEntity<List<student>>AllStudent() {
//        return new ResponseEntity<List<student>>(studentService.allStudent(), HttpStatus.OK);
//    }
//    @PostMapping("/newStudent")
//    public student addStudent(){
//        student st= new student(112222);
//        studentService.addStudent(st);
//        return st;
//    }
//    //Lay student
//  //  @GetMapping("/{studentId}")
////    public student getStudentById(@PathVariable Integer studentId){
//  //      return studentService.getOneStudent(studentId);
// //   }
////    // lay information
////    @Autowired
////    private informationService informationService;
////    @GetMapping("/inf/{studentId}")
////    public information getin4(@PathVariable Integer studentId){
////        return informationService.getInformationById(studentId);
////    }
//
//
//  //  @DeleteMapping("/{studentId}")
// //   public student deleteStudentById(@PathVariable Integer studentId){
//    //    return studentService.deleteStudent(studentId);
//  //  }
//}
