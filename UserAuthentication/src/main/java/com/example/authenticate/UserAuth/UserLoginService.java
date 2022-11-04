package com.example.authenticate.UserAuth;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("login")
public class UserLoginService {

	@Autowired
	UserLoginRepo repo;

	public String listAll(String uname, String pass) {
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

		String inv="Invalid User";
		String login_user = "Welcome ".concat(store);

		if (transformedvalues.isEmpty()) {
			return inv;
		} else {
			return login_user;
		}

	}

}
