package com.example.dependency_shiv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	private DependencyRepo c1;
	@GetMapping("/dependency/Actuator")
	public List<DependencyEntity> getjoi(){
		
		return c1.getjoin(1);
	
	}
	@GetMapping("/dependency/mysql")
	public List<DependencyEntity> getjoii(){
		
		return c1.getjoin(2);
	
	}
	@GetMapping("/dependency/jpa")
	public List<DependencyEntity> getjii(){
		
		return c1.getjoin(3);
	
	}
	@GetMapping("/dependency/jdbc")
	public List<DependencyEntity> getoii(){
		
		return c1.getjoin(4);
	
	}
	@GetMapping("/dependency/web")
	public List<DependencyEntity> gejoii(){
		
		return c1.getjoin(5);
	
	}
	@GetMapping("/dependency/h2")
	public List<DependencyEntity> gtjoii(){
		
		return c1.getjoin(6);
	
	}
}
