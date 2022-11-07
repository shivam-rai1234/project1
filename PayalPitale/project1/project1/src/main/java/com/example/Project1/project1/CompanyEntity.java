package com.example.Project1.project1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class CompanyEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer company_id;
	private String company_name;
	private String ceo_of_company;
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCeo_of_company() {
		return ceo_of_company;
	}
	public void setCeo_of_company(String ceo_of_company) {
		this.ceo_of_company = ceo_of_company;
	}
	public Integer getNo_of_times_spring_boot_used() {
		return no_of_times_spring_boot_used;
	}
	public void setNo_of_times_spring_boot_used(Integer no_of_times_spring_boot_used) {
		this.no_of_times_spring_boot_used = no_of_times_spring_boot_used;
	}
	private Integer no_of_times_spring_boot_used;

}
