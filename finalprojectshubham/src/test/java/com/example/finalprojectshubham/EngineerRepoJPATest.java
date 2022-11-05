package com.example.finalprojectshubham;

import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
		@SpringBootTest

		public class EngineerRepoJPATest {

			    @Autowired
			    private EngineerService erjpa;

			    @Test
			    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
			        List<EngineerEntity> emp = erjpa.getSample();

			        Assert.assertEquals(emp.size(), 4);
			        Assert.assertEquals(emp.get(0).getQuestion_asked(),"yes");
			        Assert.assertEquals(emp.get(1).getQuestion_asked(),"no");
			        Assert.assertEquals(emp.get(2).getQuestion_asked(),"yes");
			        Assert.assertEquals(emp.get(3).getQuestion_asked(),"no");
			    }
			
		}

