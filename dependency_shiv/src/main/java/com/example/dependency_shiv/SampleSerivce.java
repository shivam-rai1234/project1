package com.example.dependency_shiv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleSerivce {
	
	@Autowired
	private DependencyRepo a;
	public List<DependencyEntity> getSample(){
		ArrayList<DependencyEntity> transformedvalues=new ArrayList<DependencyEntity>();
    	for(DependencyEntity emt:a.findAll()) {
    		DependencyEntity temp=new DependencyEntity();
    		temp.setId(emt.getId());
    		temp.setDep_name(emt.getDep_name());
    		temp.setThere_dependency(emt.getThere_dependency());
    		
    		
    		transformedvalues.add(temp);
    	}
        return a.findAll();
    }

}
