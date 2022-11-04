package com.kpi.project1.anamproject1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DetailsController {
	@Autowired
	private DetailsRepo dr;
	@GetMapping("/web")
	public List<DetailsEntity> detail1(){
		return dr.getdetail1(1);
	}

	@GetMapping("/health")
	public List<DetailsEntity> detail2(){
		return dr.getdetail1(2);
	}

}
