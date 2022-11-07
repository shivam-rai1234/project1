package com.example.project1.nirata_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
@Autowired
private UsersRepo ur;
@GetMapping("/frequency_of_logging_time")

public List<UsersEntity> getsample(){
	ArrayList<UsersEntity> transformedvalues=new ArrayList<UsersEntity>();

	for(UsersEntity us:ur.findAll()) {
		UsersEntity temp = new UsersEntity();

		temp.setuserid(us.getuserid());
		temp.setusername(us.getusername());
		temp.setfrequency_of_logging_time(us.getfrequency_of_logging_time());
		transformedvalues.add(temp);
				
	}
	return transformedvalues;
}
}

