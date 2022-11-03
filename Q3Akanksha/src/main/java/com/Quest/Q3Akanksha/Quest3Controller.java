package com.Quest.Q3Akanksha;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Quest3Controller {

	
	@Autowired
	private Quest3Repo er;

	
	
	// if we want to fetch only name use this end point
	
	@GetMapping("/A")
	public ArrayList<String> getSample() {
		ArrayList<String> obj = new ArrayList<String>();
		for (Quest3Entity emt : er.findAll()) {
			if (emt.getEmp_name().startsWith("A")) {
				obj.add(emt.getEmp_name());

			}
		}

		return obj;

	}
	
	
	// if we have to fetch all data of entries which satisfying it than use this
	@GetMapping("/c1")
	public List<Quest3Entity> joinco() {

		return er.getjoin(1);
	}
	
	
}
