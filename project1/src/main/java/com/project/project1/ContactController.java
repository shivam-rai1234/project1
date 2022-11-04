package com.project.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/contactus/emergency")
	public List<ContactEntity> getSample1() {

		return cl.getJoin2();
	}

	// Requesting for only Company Support contact details
	@GetMapping("/contactus/CompanySupport")
	public List<ContactEntity> getSample2() {

		return cl.getJoin3();
	}

	@GetMapping("/contact/{name}")
	public Object ContactEntity(@PathVariable String name) {

		for (ContactEntity chk : cl.findAll()) {
			ContactEntity temp = new ContactEntity();

			if (name.equals(chk.getContact_Name())) {
				temp.setId(chk.getId());
				temp.setContact_No(chk.getContact_No());
				temp.setContact_Name(chk.getContact_Name());
				temp.setSupport(chk.getSupport());
				temp.setSupport_Id(chk.getSupport_Id());
				return temp;
			}
		}
		return "Not present In the Support Team Directory";
	}

}
