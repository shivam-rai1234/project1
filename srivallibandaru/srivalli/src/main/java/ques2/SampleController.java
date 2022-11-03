package ques2;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


	
	@RestController
	public class SampleController {
	    @Autowired
	    private EmployeeRepo er;
	    
	    @GetMapping("/id")
	    public List<String> getid() {
	        ArrayList<String> values=new ArrayList<String>();
	        for(EmployeeEntity emt:er.findAll()) {
	            String name;
	            name = emt.getEmp_name();
	            values.add(name);
	        }
	        return values;
	    }

	}