package com.example.Final.App;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FinalController {
	
	@Autowired
	private FinalRepo f;
	
	@GetMapping("/time") 
	public List<FinalEntity> getSample(){
		ArrayList<FinalEntity> transformedvalues=new ArrayList<FinalEntity>();
    	for(FinalEntity emt:f.findAll()) {
    		FinalEntity temp=new FinalEntity();
    		temp.setId(emt.getId());
    		temp.setTime_in_ms(emt.getTime_in_ms());
    		
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
}
	
	@GetMapping("/timefor/id={id}") 
	public List<FinalEntity> getSample2(@PathVariable("id") Integer id){
		
		 return f.getJoin(id);
		 
		 //http://localhost:8080/details/id=3 to get value of id 3
		
	}
}
