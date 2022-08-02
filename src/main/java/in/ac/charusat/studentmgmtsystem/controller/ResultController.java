package in.ac.charusat.studentmgmtsystem.controller;

        import in.ac.charusat.studentmgmtsystem.model.Resultclass;
        //import in.ac.charusat.studentmgmtsystem.model.Student_1;
        import in.ac.charusat.studentmgmtsystem.repository.ResultRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

@RestController
public class ResultController {
    @Autowired
    ResultRepository resultRepository;

    List<Resultclass> results = new ArrayList<>(
            Arrays.asList(
                    new Resultclass(1, 244, "95"),
                    new Resultclass(2, 258, "97"),
                    new Resultclass(3, 318, "92")
            )
    );

    @GetMapping("/listResults")
    public List<Resultclass> getAllStudents() {
        return resultRepository.findAll();
    }

    // Get
    @GetMapping("/result/{id}")
    public Resultclass getStudent(@PathVariable Integer id) {
        return resultRepository.findById(id).get();
    }

    // Delete
    @DeleteMapping("/result/{id}")
    public List<Resultclass> deleteStudent(@PathVariable Integer id) {
        resultRepository.delete(resultRepository.findById(id).get());
        return resultRepository.findAll();
    }
    @PostMapping("/result")
    public List<Resultclass> addStudent(@RequestBody Resultclass results) {
        resultRepository.save(results);
        return resultRepository.findAll();
    }


}
