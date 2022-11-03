package com.kpi.employee_details;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class EmployeeEntity {
	
	@Entity
	@Table(name="Employee")
	public class Client_entity {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int Id;
	private String Name;
	private String Salary;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	

}

}

