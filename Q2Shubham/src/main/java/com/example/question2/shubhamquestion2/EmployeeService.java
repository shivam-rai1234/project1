package com.example.question2.shubhamquestion2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;



@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepoJPA a;
    
    
    public List<EmployeeEntity> getSample(){
        ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
        for(EmployeeEntity emt:a.findAll()) {
            EmployeeEntity temp=new EmployeeEntity();
            temp.setId(emt.getId());
            
            
            transformedvalues.add(temp);
        }
        return a.findAll();
    }
}
