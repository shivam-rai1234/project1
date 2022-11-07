package com.student.interviewpreprationmicroservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
	
	@Autowired
	private QuestionsRepo qr;
	public List<QuestionsEntity> getsamples(){
		ArrayList<QuestionsEntity> transformedvalues=new ArrayList<QuestionsEntity>();
    	for(QuestionsEntity emt:qr.findAll()) {
    		QuestionsEntity temp=new QuestionsEntity();
    		temp.setS_no(emt.getS_no());
    		temp.setTool(emt.getTool());
    		temp.setQues1(emt.getQues1());
    		temp.setQues1(emt.getQues2());
    		temp.setQues1(emt.getQues3());
    		temp.setQues1(emt.getQues4());
    		temp.setQues1(emt.getQues5());
    		
    		transformedvalues.add(temp);
    	}
        return qr.findAll();
    }

}