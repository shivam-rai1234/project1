package com.example.crudoperation.crudoperation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*@Gaurav Borse*/

@Entity
@Table(name = "employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Empid;
	private String Empname;
	private Integer Salary;
	public EmployeeEntity(Integer empid, String empname, Integer salary) {
		super();
		Empid = empid;
		Empname = empname;
		Salary = salary;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getEmpid() {
		return Empid;
	}
	public void setEmpid(Integer empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	
	
}
