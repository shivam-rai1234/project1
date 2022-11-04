package com.example.dependency_shiv;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name ="dependency") 
public class DependencyEntity {
	@Id  
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String dep_name;
	private String there_dependency;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getThere_dependency() {
		return there_dependency;
	}
	public void setThere_dependency(String there_dependency) {
		this.there_dependency = there_dependency;
	}

}
