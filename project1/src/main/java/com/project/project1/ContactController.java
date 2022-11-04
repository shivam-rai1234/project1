package com.project.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@Autowired
	private ContactRepo cl;

	// For Mapping for all the supported team contact details
	@GetMapping("/contact")
	public List<ContactEntity> getSample() {

		return cl.getJoin1();
	}

	// For Mapping for all the emergency team contact details
	@GetMapping("/contact/emergency")
	public List<ContactEntity> getSample1() {

		return cl.getJoin2();
	}

	// For Mapping for all the Company Support contact details
	@GetMapping("/contact/CompanySupport")
	public List<ContactEntity> getSample2() {

		return cl.getJoin3();
	}
}