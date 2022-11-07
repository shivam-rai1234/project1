package ecommerce.akshit_project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import ecommerce.akshit_project.Student;


import ecommerce.akshit_project.StudentRepo;

@Service
public class StudentService {
@Autowired
    private StudentRepo repo;
public List<Student> listAll() {
        return repo.findAll();
    }
    
    public void save(Student std) {
        repo.save(std);
    }
    
    public Student get(Integer id) {
        return repo.findById(id).get();
    }
    
    public void delete(Integer id) {
        repo.deleteById(id);
    }
 
}
