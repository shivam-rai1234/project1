package com.assigment1.projectday1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class employee {
	
	private static String Name = null;
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;  }
	
	public int getSalary() {
		return getSalary();
	}
	public void setName(int Salary) {
		this.id = Salary;  }
}

