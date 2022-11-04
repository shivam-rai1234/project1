package kpi.com.question1.finalassessment1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/Id") 
	public List<String> getSample(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		
    		
    		transformedvalues.add(emt.getempname());
    	}
    	return transformedvalues;
	}}

	

	