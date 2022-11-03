package com.example.Q2EmpTableAbhitayu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    private EmpRepo er;
    @GetMapping("/id")
    public List<String> getName(){
        ArrayList<String> name=new ArrayList<String>();
        for(EmpEntity emt:er.findAll()) {
            name.add(emt.getEmp_name());
            
        }
        return name;
    }
}
