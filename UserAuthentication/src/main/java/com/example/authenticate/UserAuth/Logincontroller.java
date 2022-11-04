package com.example.authenticate.UserAuth;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Logincontroller {

	@Resource(name = "login")
	UserLoginService ul;

	@RequestMapping("/login/{uname}/{pass}")
	public String Show(@PathVariable String uname, @PathVariable String pass) {
		return ul.sign_in(uname, pass);
	}

}
