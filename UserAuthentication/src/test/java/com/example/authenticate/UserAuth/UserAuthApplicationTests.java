package com.example.authenticate.UserAuth;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserAuthApplicationTests {

	@Autowired
	private UserLoginService uls;

	@Test
	void contextLoads() {

		String check = uls.sign_in("user4", "456");
		Assert.assertEquals("Welcome [user4]", check);
		
		String check2 = uls.sign_in("user6", "456");
		Assert.assertEquals("Invalid User", check2);
	}

}
