package kpi.com.question1.finalassessment1;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Service
public class SampleJPAControllerTest
{
	@Autowired
	private EmployeeRepoJPA a;
	
	
	public List<EmployeeEntity> getSample(){
		ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
    	for(EmployeeEntity emt:a.findAll()) {
    		EmployeeEntity temp=new EmployeeEntity();
    		temp.setempid(emt.getempid());
    		
    		
    		transformedvalues.add(temp);
    	}
        return a.findAll();
    }
}
