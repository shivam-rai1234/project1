package com.kpi.employee_details;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="Employee")
	public class EmployeeEntity {
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer Id;
	    private String Name;
	    private String Salary;
		public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getSalary() {
			return Salary;
		}
		public void setSalary(String salary) {
			Salary = salary;
		}
	    
	    

}
