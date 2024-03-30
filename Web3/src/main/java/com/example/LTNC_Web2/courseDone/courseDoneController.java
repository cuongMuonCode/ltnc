//package com.example.LTNC_Web2.courseDone;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/course")
//public class courseDoneController {
//    @Autowired
//    private courseDoneService courseDoneService;
//
//    @GetMapping("/allDone")
//    public List<courseDone> all(){
//        return courseDoneService.getAllDone();
//    }
//
//    @GetMapping("/{studentId}")
//    public courseDone getCourseDoneById(@PathVariable Integer studentId){
//        return courseDoneService.getCourseDoneById(studentId);
//    }
//
////    @PutMapping("/{studentId}/addCourse")
////    public void getGpaInCourse(@PathVariable Integer studentId )    {
////     //   courseDoneService.getCourseDoneById(studentId).addCourseDone("GT100",1.0);
////        courseDoneService.addGpaInCourse(studentId);
////    }
//
//
//
//}
