package com.example.Q2Saynam;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepo er;
    @GetMapping("/id")
    public List<String> getName(){
        ArrayList<String> name=new ArrayList<String>();
        for(EmployeeEntity emt:er.findAll()) {
            name.add(emt.getEmployee_name());
            
        }
        return name;
    }
}