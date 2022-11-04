package com.example.Q4;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@Autowired
	private SpringBootRepo sp;
	
	@GetMapping("/SpringBoot")
	public ArrayList<SpringBootEntity> getSample() {
		ArrayList<SpringBootEntity> transformedvalues = new ArrayList<SpringBootEntity>();
							//Set<Integer> s1 = new HashSet<Integer>();
		for (SpringBootEntity emt : sp.findAll()) {
			SpringBootEntity temp = new SpringBootEntity();
							//temp.setId(emt.getId());
			temp.setReasons(emt.getReasons());
			transformedvalues.add(temp);
			
		}
		return transformedvalues;
	}

	public static String get(@PathVariable String reasons) {
		// TODO Auto-generated method stub
		return reasons;
	}
}
