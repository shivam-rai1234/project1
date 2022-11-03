package com.example.assignment3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer EmpId;
	private String EmpName;
	private String EmpSal;
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer EmpId) {
		EmpId = EmpId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(String empSal) {
		EmpSal = empSal;
	}
	

}
