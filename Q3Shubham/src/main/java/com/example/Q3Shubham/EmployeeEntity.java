package com.example.Q3Shubham;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


	 
	@Entity
	@Table(name="employee")

	public class EmployeeEntity{
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer id;
		private String employee_name;
		private String salary;
		
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
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		
		
		
		
		
		
	}


