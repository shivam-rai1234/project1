package com.example.finalprojectshubham;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

 
@Entity
@Table(name="engineer")

public class EngineerEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer engineer_id;
	private String engineer_name;
	private String question_asked;
	
	public Integer getEngineer_id() {
		return engineer_id;
	}
	public void setEngineer_id(Integer engineer_id) {
		this.engineer_id = engineer_id;
	}
	public String getEngineer_name() {
		return engineer_name;
	}
	public void setEngineer_name(String engineer_name) {
		this.engineer_name = engineer_name;
	}
	public String getQuestion_asked() {
		return question_asked;
	}
	public void setQuestion_asked(String question_asked) {
		this.question_asked = question_asked;
	}
	
	
	
	
	
	
}




