package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class runtime {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	long time_in_ms;
	runtime() {}
	runtime(int id, long time_in_ms)
	{
		this.id = id;
		this.time_in_ms = time_in_ms;
	}
}
