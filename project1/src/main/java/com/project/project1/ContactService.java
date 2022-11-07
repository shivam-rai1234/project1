package com.project.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactService {
	
	/**
	 * @author MashirNizami
	 *
	 */

	@Autowired
	private ContactRepo cl;

//Create this service class for check in Junit for Database-Springboot Integration
	public List<ContactEntity> getSample() {

		return cl.getJoin1();
	}

	public List<ContactEntity> getSample1() {

		return cl.getdetail1(112);
	}

	public List<ContactEntity> getSample2() {

		return cl.getdetail1(0);
	}
}