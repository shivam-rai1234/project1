package com.example.authenticate.UserAuth;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class UserLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;

	private String Username;

	private String Password;

	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLogin(Integer id, String username, String password) {
		super();
		Id = id;
		Username = username;
		Password = password;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
