package com.assigment1.project1;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {


@Autowired
 private EmployeeRepo c2 ;

@GetMapping ("/A")

public List<Employee> getjos () {

return c2.getjoin("a");
}
}