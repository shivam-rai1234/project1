package com.student.interviewpreprationmicroservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private QuestionsRepo qr;
	
	@GetMapping("/java")
	public List<QuestionsEntity> joincol1(){
		return qr.getdetails(1);
	}
	
	@GetMapping("/spring")
	public List<QuestionsEntity> joincol2(){
		return qr.getdetails(2);
	}
	
	@GetMapping("/dbms")
	public List<QuestionsEntity> joincol3(){
		return qr.getdetails(3);
	}

}
