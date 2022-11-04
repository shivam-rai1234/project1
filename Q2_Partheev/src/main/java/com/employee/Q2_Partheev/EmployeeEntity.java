package com.employee.Q2_Partheev;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employee_id;
	private String employee_name;
	private Integer employee_sal;
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public Integer getEmployee_sal() {
		return employee_sal;
	}
	public void setEmployee_sal(Integer employee_sal) {
		this.employee_sal = employee_sal;
	}
	
	
}
