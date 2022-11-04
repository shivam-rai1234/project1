package com.kpi_project_vaishnavi.project_vaishnavi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvantagesController 
{
	@Autowired
	private AdvantagesRepo ar;
	
	@GetMapping("/spring")
	public List<AdvantagesEntity> adv1(){
		return ar.getadvantages(101);
	}
	
	@GetMapping("/java")
	public List<AdvantagesEntity> adv2(){
		return ar.getadvantages(102);
	}
	
	@GetMapping("/junit")
	public List<AdvantagesEntity> adv3(){
		return ar.getadvantages(103);
	}
	
	@GetMapping("/all")
	public List<AdvantagesEntity> adv(){
		return ar.getadvantages1(1);
	}
}
