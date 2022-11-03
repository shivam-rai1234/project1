package com.project.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@Autowired
	private ContactRepo cl;

	@GetMapping("/contact")
	public List<ContactEntity> getSample() {

		return cl.getjoin1();
	}
	@GetMapping("/contact/emergency")
	public List<ContactEntity> getSample1() {

		return cl.getjoin2();
	}
	@GetMapping("/contact/CompanySupport")
	public List<ContactEntity> getSample2() {

		return cl.getjoin3();
	}
}