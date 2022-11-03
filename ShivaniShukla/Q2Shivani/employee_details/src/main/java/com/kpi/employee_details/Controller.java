package com.kpi.employee_details;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
	@Autowired
    private EmployeeRepo er;//up to date
    
    @GetMapping("/id") 
    public List<String> getSample1(){
        ArrayList<String> ename = new ArrayList<>();
        for(EmployeeEntity emt : er.findAll()) {
            ename.add(emt.getName());
        }
        return ename;
    }

}
