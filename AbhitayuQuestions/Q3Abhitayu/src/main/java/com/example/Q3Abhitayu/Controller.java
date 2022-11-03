package com.example.Q3Abhitayu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private EmpRepo er;

    @GetMapping("/A")
    public List<String> getfromA() {
        ArrayList<String> transformedvalues = new ArrayList<String>();
        for (EmpEntity emt : er.findAll()) {
            if (emt.getEmp_name().startsWith("A")) {
                transformedvalues.add(emt.getEmp_name());
            }

        }
        return transformedvalues;

    }
}
