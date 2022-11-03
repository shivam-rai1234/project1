package com.kpi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
@Entity
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "employeeId")
	private String employeeId;
	
	@Column(name = "employeeName")
	private String employeeName;
	
	@Column(name = "employeeSalary")
	private int employeeSalary;
	
}
