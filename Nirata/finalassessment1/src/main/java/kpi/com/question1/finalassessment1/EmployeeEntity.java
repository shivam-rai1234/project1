package kpi.com.question1.finalassessment1;

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
	private Integer empid;
	private String empname;
	private int empsalary;
	
	
	public String getempname() {
		return empname;
	}
	public void setempname(String empname) {
		this.empname = empname;
	}
	public Integer geempiId() {
		return empid;
	}
	public void setempid(Integer empid) {
		this.empid = empid;
	}
	public Integer empsalary() {
		return empsalary;
	}
	public void setempsalary(Integer empsalary) {
		this.empsalary = empsalary;
	}
	
	
	
	
}