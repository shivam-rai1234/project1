package com.project1_que2_3Nov.que2_3Nov_Vaishnavi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")

public class EmployeeEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String employee_name;
	private String employee_salary;
	
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
	public String getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(String employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	
}