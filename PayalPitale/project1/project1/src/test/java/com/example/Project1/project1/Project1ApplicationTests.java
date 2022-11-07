package com.example.Project1.project1;



import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Project1ApplicationTests {
	@Autowired
	private CompanyController c;
	
	@Test
	void contextLoads() {
		List<CompanyEntity> ans = c.getcompanydetails();
		int r = ans.get(0).getCompany_id();
		assertEquals(r,101);
		
		List<CompanyEntity> ans1 = c.getcompanydetails();
		int r1 = ans1.get(1).getCompany_id();
		assertEquals(r1,202);
		
		List<CompanyEntity> ans2 = c.getcompanydetails();
		int r2 = ans.get(2).getCompany_id();
		assertEquals(r2,302);
		
		List<CompanyEntity> ans3 = c.getcompanydetails();
		int r3 = ans.get(3).getCompany_id();
		assertEquals(r3,402);
		
		List<CompanyEntity> ans4 = c.getcompanydetails();
		int r4 = ans.get(4).getCompany_id();
		assertEquals(r4,502);
		
		
		
		
			
			
			
		}
		
	}

		