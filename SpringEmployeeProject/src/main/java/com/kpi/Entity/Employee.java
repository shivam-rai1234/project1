package com.kpi.Entity;

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
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "employeeId")
	private int employeeId;
	
	@Column(name = "employeeName")
	private String employeeName;
	
	@Column(name = "employeeSalary")
	private int employeeSalary;
	
}
