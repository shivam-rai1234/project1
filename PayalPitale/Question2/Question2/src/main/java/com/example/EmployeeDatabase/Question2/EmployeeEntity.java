package com.example.EmployeeDatabase.Question2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	

	private Integer id;
	private String employee_name;
	private Integer employee_salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public Integer getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(Integer employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	


}
