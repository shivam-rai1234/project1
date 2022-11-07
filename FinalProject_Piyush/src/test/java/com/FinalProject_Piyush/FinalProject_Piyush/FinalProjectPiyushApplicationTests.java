package com.FinalProject_Piyush.FinalProject_Piyush;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * @author PiyushBodhani
 *
 */
@SpringBootTest
class FinalProjectPiyushApplicationTests {
	@Autowired
	private Controller c;

	@Test
	void contextLoads() {
		List<dbdetailsEntity> ans1 = c.dbdetails(1);
		int t1 = ans1.get(0).getDb_id();
		assertEquals(t1, 1);
		String str1 = ans1.get(0).getDb_name();
		assertEquals(str1, "MYSQL");

		List<dbdetailsEntity> ans2 = c.dbdetails(2);
		int t2 = ans2.get(0).getDb_id();
		assertEquals(t2, 2);
		String str2 = ans2.get(0).getDb_name();
		assertEquals(str2, "mongodb");

		List<dbdetailsEntity> ans3 = c.dbdetails(3);
		int t3 = ans3.get(0).getDb_id();
		assertEquals(t3, 3);
		String str3 = ans3.get(0).getDb_name();
		assertEquals(str3, "H2 database");

		List<dbdetailsEntity> ans4 = c.dbdetails(4);
		int t4 = ans4.get(0).getDb_id();
		assertEquals(t4, 4);
		String str4 = ans4.get(0).getDb_name();
		assertEquals(str4, "Oracle");

		List<dbdetailsEntity> ans5 = c.dbdetails(5);
		int t5 = ans5.get(0).getDb_id();
		assertEquals(t5, 5);
		String str5 = ans5.get(0).getDb_name();
		assertEquals(str5, "PostgreSQL");

	}

}
