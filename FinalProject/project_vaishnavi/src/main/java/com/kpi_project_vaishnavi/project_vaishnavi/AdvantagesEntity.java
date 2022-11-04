package com.kpi_project_vaishnavi.project_vaishnavi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "advantages")
public class AdvantagesEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String field_name;
	private String advantage_1;
	private String advantage_2;
	private String advantage_3;	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getField_name() {
		return field_name;
	}
	public void setField_name(String field_name) {
		this.field_name = field_name;
	}
	public String getAdvantage_1() {
		return advantage_1;
	}
	public void setAdvantage_1(String advantage_1) {
		this.advantage_1 = advantage_1;
	}
	public String getAdvantage_2() {
		return advantage_2;
	}
	public void setAdvantage_2(String advantage_2) {
		this.advantage_2 = advantage_2;
	}
	public String getAdvantage_3() {
		return advantage_3;
	}
	public void setAdvantage_3(String advantage_3) {
		this.advantage_3 = advantage_3;
	}
	
}
