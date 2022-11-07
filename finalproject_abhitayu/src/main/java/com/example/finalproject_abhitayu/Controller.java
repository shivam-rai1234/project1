package com.example.finalproject_abhitayu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private InstituteRepo ir;
	 
	@GetMapping("/courses/{course_name}")
	public List<InstituteEntity> joincourse(@PathVariable String course_name){
		return ir.getjoin(course_name);
	}
	
	@GetMapping("/alldetails") 
	public List<InstituteEntity> getSample(){
		ArrayList<InstituteEntity> transformedvalues=new ArrayList<InstituteEntity>();
    	for(InstituteEntity emt:ir.findAll()) {
    		InstituteEntity temp=new InstituteEntity();
    		temp.setCourse_id(emt.getCourse_id());
    		temp.setCourse_name(emt.getCourse_name());
    		temp.setFaculty_name(emt.getFaculty_name());
    		temp.setFees(emt.getFees());
    		
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
	}
	@GetMapping("/courses") 
	public List<String> getcourse(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	for(InstituteEntity emt:ir.findAll()) {
    		transformedvalues.add(emt.getCourse_name());
    		
    	}
    	return transformedvalues;
	}
}
