package com.project.project1;


import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ContactServiceTest {
	
	
	    @Autowired
	    private ContactService con;
	    
	    //Testing according to your categorize

	    @Test
	    public void ContactTest() {
	        List<ContactEntity> contact = con.getSample();

	        Assert.assertEquals(contact.get(1).getContact_Name(),"Emergency");
	        Assert.assertEquals(contact.get(1).getContact_No(),101);



	    }
	    @Test
	    public void Contact1Test() {
	        List<ContactEntity> contact = con.getSample1();

	        Assert.assertEquals(contact.get(0).getContact_Name(),"Helpline");
	        Assert.assertEquals(contact.get(0).getContact_No(),100);



	    }
	    @Test
	    public void Contact2Test() {
	        List<ContactEntity> contact = con.getSample2();

	        Assert.assertEquals(contact.get(3).getContact_Name(),"Senior HR Manager");
	        Assert.assertEquals(contact.get(1).getContact_No(),837383353);



	    }
	}