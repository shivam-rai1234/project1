package com.Q3.Q3Piyush;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PiyushBodhani
 *
 */
@RestController
public class Controller {
	@Autowired
	private EmployeeeeRepository er;

	@GetMapping("/A")

	public List<String> getsample() {
		ArrayList<String> transformedvalues = new ArrayList<String>();
		for (EmployeeeeEntity emt : er.findAll()) {
			if (emt.getEm_name().startsWith("A")) {
				transformedvalues.add(emt.getEm_name());
			}

		}
		return transformedvalues;

	}
}
