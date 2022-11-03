package com.Quest.Q2Akanksha;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class QuestionEmployeeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer emp_id;
	private Integer emp_salary;
	private String emp_name;
	
	
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	

	public Integer getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(Integer emp_salary) {
		this.emp_salary = emp_salary;
	}

	
	
	
}
