package com.example.authenticate.UserAuth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logincontroller {

	@Autowired
	UserLoginRepo repo;

	@GetMapping("/login/{uname}/{pass}")
	public String listAll(@PathVariable String uname, @PathVariable String pass) {
		ArrayList<String> transformedvalues = new ArrayList<String>();
		for (UserLogin chk : repo.findAll()) {
			UserLogin temp = new UserLogin();

			if (uname.equals(chk.getUsername()) && pass.equals(chk.getPassword())) {
				temp.setUsername(chk.getUsername());

			}
			
			transformedvalues.add(temp.getUsername());
			while (transformedvalues.remove(null))
				; // Removing null values

		}
		String store = transformedvalues.toString();
	
		String login_user = "Welcome ".concat(store);

		return login_user;

	}

}
