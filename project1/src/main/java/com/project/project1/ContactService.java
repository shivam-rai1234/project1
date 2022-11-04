package com.project.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactService {

	@Autowired
	private ContactRepo cl;

//Create this service class for check in Junit for Database-Springboot Integration
	public List<ContactEntity> getSample() {

		return cl.getJoin1();
	}

	public List<ContactEntity> getSample1() {

		return cl.getJoin2();
	}

	public List<ContactEntity> getSample2() {

		return cl.getJoin3();
	}
}