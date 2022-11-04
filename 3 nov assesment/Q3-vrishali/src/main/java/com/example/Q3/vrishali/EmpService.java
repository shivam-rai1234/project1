package com.example.Q3.vrishali;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo e;
	
	public List<EmpEntity> getall(){
		return e.findAll();
	}

	

}
