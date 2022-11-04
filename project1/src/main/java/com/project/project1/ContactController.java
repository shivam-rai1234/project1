package com.project.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@Autowired
	private ContactRepo cl;

	// Requesting for all the supported team contact details
	@GetMapping("/contact")
	public List<ContactEntity> getSample() {

		return cl.getJoin1();
	}

	// Requesting for only emergency team contact details
	@GetMapping("/contact/emergency")
	public List<ContactEntity> getSample1() {

		return cl.getJoin2();
	}

	// Requesting for only Company Support contact details
	@GetMapping("/contact/CompanySupport")
	public List<ContactEntity> getSample2() {

		return cl.getJoin3();
	}
}