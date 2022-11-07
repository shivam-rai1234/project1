package ecommerce.akshit_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 


import ecommerce.akshit_project.Student;
import  ecommerce.akshit_project.StudentService;


 
@RestController
public class StudentController {
@Autowired
    private StudentRepo service;
 
    @GetMapping("/a")
    public List<String> akshit() {
        ArrayList<String> liststudent = new ArrayList<String>();
        for(Student a:service.findAll()) { 
        	liststudent.add(a.getStudentname());
        
        }
        return liststudent;
        
        
    }
//    public List<Student> joinhr() {
//
//		return service.akshit();
//	}
//
// 
//    @GetMapping("/new")
//    public String add(Model model) {
//        model.addAttribute("student", new Student());
//        return "new";
//    }
// 
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String saveStudent(@ModelAttribute("student") Student std) {
//        service.save(std);
//        return "redirect:/";
//    }
//    
//    @RequestMapping("/edit/{id}")
//    public ModelAndView showEditStudentPage(@PathVariable(name = "id") Integer id) {
//        ModelAndView mav = new ModelAndView("new");
//        Student std = service.get(id);
//        mav.addObject("student", std);
//        return mav;
//        
//    }
//  
//    
//}
}