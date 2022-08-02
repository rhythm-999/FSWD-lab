package in.ac.charusat.studentmgmtsystem.repository;

import in.ac.charusat.studentmgmtsystem.model.Student;
import in.ac.charusat.studentmgmtsystem.model.courseclass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<courseclass, Integer> {
}