package com.example.database.databaseInteraction;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Test for this call is done
 */

@Service("name")
public class EmpService {

	@Autowired
	private EmployeeRepo er;// up to date

	public ArrayList<String> getSample() {
		ArrayList<String> transformedvalues = new ArrayList<String>();
		for (EmployeeEntity emt : er.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();

			if (emt.getEmpname().startsWith("a")) {
				temp.setEmpname(emt.getEmpname());
			}
			if (emt.getEmpname().startsWith("A")) {
				temp.setEmpname(emt.getEmpname());
			}

			transformedvalues.add(temp.getEmpname());
			while (transformedvalues.remove(null)); //Removing null values
		}
		return transformedvalues;
	}

}
