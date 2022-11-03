package com.project.project1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
//Mention the table name 

public class ContactEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String Contact_Name;
	private int contact;
	private String support;
	private int Support_Id;
	
	//Using Getter and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContact_Name() {
		return Contact_Name;
	}
	public void setContact_Name(String contact_Name) {
		Contact_Name = contact_Name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getSupport() {
		return support;
	}
	public void setSupport(String support) {
		this.support = support;
	}
	public int getSupport_Id() {
		return Support_Id;
	}
	public void setSupport_Id(int support_Id) {
		Support_Id = support_Id;
	}


	
}