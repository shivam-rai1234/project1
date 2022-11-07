package com.example.project1.nirata_project;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest

public class UsersServiceTest {
	@Autowired
	private UsersService usp;
	
	@Test
	public void contextLoads() {
		List<UsersEntity> users = usp.getsample();
		
		Assert.assertEquals(users.size(),5);
	}

}
