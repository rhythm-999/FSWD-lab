package in.ac.charusat.studentmgmtsystem.repository;

import in.ac.charusat.studentmgmtsystem.model.Resultclass;
import in.ac.charusat.studentmgmtsystem.model.courseclass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Resultclass, Integer> {
}
