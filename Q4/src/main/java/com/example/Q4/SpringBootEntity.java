package com.example.Q4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "SpringBoot")
public class SpringBootEntity {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
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
