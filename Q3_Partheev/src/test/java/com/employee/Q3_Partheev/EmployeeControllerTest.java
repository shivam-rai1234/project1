package com.employee.Q3_Partheev;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTest {
    
    @Autowired
    private EmployeeRepo er;
    
    @Test
    public void check() {
        List<EmployeeEntity> emp = (List<EmployeeEntity>) er.findAll();
        Assert.assertEquals(emp.size(),3);
        
    }

}
