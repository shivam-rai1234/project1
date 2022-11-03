package com.example.question2.shubhamquestion2;

	
	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class EmployeeIDController {
		
		@Autowired
		private EmployeeRepo er;//up to date
		
		@GetMapping("/id") 
		public List<String> getSample1(){
	        ArrayList<String> empname = new ArrayList<>();
	        for(EmployeeEntity emt : er.findAll()) {
	            empname.add(emt.getEmployee_name());
	        }
	        return empname;
	    }

	}


