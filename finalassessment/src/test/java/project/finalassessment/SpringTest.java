package project.finalassessment;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SpringTest {

	@Autowired
	private SpringRepo er;
	
	
	@Test
	
	public void spring_test() {
		
		List<SpringEntity> spring = (List<SpringEntity>) er.findvalues();
		Assert.assertEquals(spring.size(),3);
	}
}
