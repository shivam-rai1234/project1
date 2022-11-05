package com.kpi.project.ProjectVrishali;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VrishaliMore
 *
 */
@Entity
@Table(name="user")
public class UserEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column
	private Integer user_id;
	
	@Column
	private String appliction_name ;
	
	@Column
	private String user_code;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getAppliction_name() {
		return appliction_name;
	}

	public void setAppliction_name(String appliction_name) {
		this.appliction_name = appliction_name;
	}

	public String getUser_code() {
		return user_code;
	}

	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
		
	
}
