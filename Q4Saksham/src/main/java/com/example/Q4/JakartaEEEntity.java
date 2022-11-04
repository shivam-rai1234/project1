package com.example.Q4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "JakartaEE")
public class JakartaEEEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//private int Id;
	private String Reasons;
	//public int getId() {
	//	return Id;
	//}
	//public void setId(int id) {
	//	Id = id;
	//}
	public String getReasons() {
		return Reasons;
	}
	public void setReasons(String reasons) {
		Reasons = reasons;
	}

}
