package com.example.project1.nirata_project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
	@Autowired
	private UsersRepo urp;
	
	public List<UsersEntity> getsample(){
		return urp.findAll();
	}

}
