package in.ac.charusat.studentmgmtsystem.controller;

//import com.example.course.model.courseclass;
//import org.springframework.beans.factory.annotation.Autowired;
import in.ac.charusat.studentmgmtsystem.model.Student;
import in.ac.charusat.studentmgmtsystem.model.courseclass;
import in.ac.charusat.studentmgmtsystem.repository.CourseRepository;
//import in.ac.charusat.studentmgmtsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class coursecontroller {
    @Autowired
    CourseRepository CourseRepository;
//    List<courseclass> courses = new ArrayList<>(
    //   Arrays.asList(
    //        new courseclass(1, "FSWD", "Full Stack Web Development"),
    //       new courseclass(2, "DAA", "Data Analytics and Algorithm"),
    //       new courseclass(3, "OS", "Operating System")
    //      )
    //  );

    @GetMapping("/listcourse")
    public List<courseclass> getCourseList() {
        return CourseRepository.findAll();
    }

    @GetMapping("/getcoursefrm/{id}")
    public courseclass getcoursefrm(@PathVariable Integer id) {
        return CourseRepository.findById(id).get();
    }

    @PostMapping("/addcourse")
    public List<courseclass> addStudent(@RequestBody courseclass courses) {
        CourseRepository.save(courses);
        return CourseRepository.findAll();
    }
    @PutMapping("/updatecourse/{id}")
    public List<courseclass> updateStudent(@RequestBody courseclass courses, @PathVariable Integer id) {
        courseclass courseclassObj = CourseRepository.findById(id).get();
        courseclassObj.setTitle(courses.getTitle());
        courseclassObj.setDiscription(courses.getDiscription());
        CourseRepository.save(courseclassObj);
        return CourseRepository.findAll();
    }

    @DeleteMapping("/deletecourse/{id}")
    public List<courseclass> deletecourse(@PathVariable Integer id) {
        CourseRepository.delete(CourseRepository.findById(id).get());
        return CourseRepository.findAll();
    }


}