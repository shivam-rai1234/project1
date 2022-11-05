package com.example.finalprojectshubham;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import java.util.ArrayList;
	import java.util.List;



	@Service
	public class EngineerService {
	    @Autowired
	    private EngineerRepoJPA a;
	    
	    
	    public List<EngineerEntity> getSample(){
	        ArrayList<EngineerEntity> transformedvalues=new ArrayList<EngineerEntity>();
	        for(EngineerEntity emt:a.findAll()) {
	        	EngineerEntity temp=new EngineerEntity();
	            temp.setEngineer_id(emt.getEngineer_id());
	            temp.setQuestion_asked(emt.getQuestion_asked());
	            
	            transformedvalues.add(temp);
	        }
	        return a.findAll();
	    }
	}

