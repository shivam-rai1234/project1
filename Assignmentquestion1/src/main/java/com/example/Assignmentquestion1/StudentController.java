package com.example.Assignmentquestion1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo std;
	
	@GetMapping("/all")
	public List<StudentEntity> getdetail(){
		System.out.println(std.getall());
		return std.getall();

	}

}
