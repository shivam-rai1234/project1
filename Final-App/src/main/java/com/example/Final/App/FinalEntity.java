package com.example.Final.App;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Runtime")
public class FinalEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int time_in_ms;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTime_in_ms() {
		return time_in_ms;
	}
	public void setTime_in_ms(int time_in_ms) {
		this.time_in_ms = time_in_ms;
	}

}
