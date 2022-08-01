package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private Integer id;
    private String title;
    private String description;

    public void Student(Integer id, String title, String desc) {
        this.id = id;
        this.title = title;
        this.description = desc;
    }

    public Course() {

    }

    public Course(Integer id, String title, String desc) {
        this.id = id;
        this.title = title;
        this.description = desc;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }
}


