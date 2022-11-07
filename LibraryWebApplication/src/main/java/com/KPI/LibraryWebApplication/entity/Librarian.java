package com.KPI.LibraryWebApplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Librarian")
public class Librarian {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Employee_id;
	private String Employee_name;
	private String Designation;
	public Librarian() {
		super();
	}
	public Librarian(Integer employee_id, String employee_name, String designation) {
		super();
		Employee_id = employee_id;
		Employee_name = employee_name;
		Designation = designation;
	}
	public Integer getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		Employee_id = employee_id;
	}
	public String getEmployee_name() {
		return Employee_name;
	}
	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}

}
