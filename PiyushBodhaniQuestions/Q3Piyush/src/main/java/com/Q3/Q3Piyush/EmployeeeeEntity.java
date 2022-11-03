package com.Q3.Q3Piyush;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "employeeee")
public class EmployeeeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int em_id;
	private String em_name;
	private int em_salary;
	public int getEm_id() {
		return em_id;
	}
	public void setEm_id(int em_id) {
		this.em_id = em_id;
	}
	public String getEm_name() {
		return em_name;
	}
	public void setEm_name(String em_name) {
		this.em_name = em_name;
	}
	public int getEm_salary() {
		return em_salary;
	}
	public void setEm_salary(int em_salary) {
		this.em_salary = em_salary;
	}
}
