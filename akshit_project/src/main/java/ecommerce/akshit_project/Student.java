package ecommerce.akshit_project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String studentname;
    private String course;
    private Integer fee;
public Student() {
 
}
public Student(Integer id, String studentname, String course, Integer fee) {
this.id = id;
this.studentname = studentname;
this.course = course;
this.fee = fee;
}
public Integer getId() {
return id;
}
public void setId(Integer id) {
this.id = id;
}
public String getStudentname() {
return studentname;
}
public void setStudentname(String studentname) {
this.studentname = studentname;
}
public String getCourse() {
return course;
}
public void setCourse(String course) {
this.course = course;
}
public Integer getFee() {
return fee;
}
public void setFee(Integer fee) {
this.fee = fee;
}
 
}
