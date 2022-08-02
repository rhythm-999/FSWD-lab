package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class courseclass {
    public courseclass() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public courseclass(Integer id, String title, String discription) {
        this.id = id;
        this.title = title;
        this.discription = discription;
    }

    @Id
    private Integer id;
    private String title;
    private String discription;
}