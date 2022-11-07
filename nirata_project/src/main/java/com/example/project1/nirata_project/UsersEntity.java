package com.example.project1.nirata_project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UsersEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userid;
	private String username;
	private Integer frequency_of_logging_time;
	
	public Integer getuserid() {
		return userid;
	}
	public void setuserid(Integer userid) {
		this.userid = userid;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public Integer getfrequency_of_logging_time() {
		return frequency_of_logging_time;
	}
	public void setfrequency_of_logging_time(Integer frequency_of_logging_time) {
		this.frequency_of_logging_time = frequency_of_logging_time;
		
	}

}
