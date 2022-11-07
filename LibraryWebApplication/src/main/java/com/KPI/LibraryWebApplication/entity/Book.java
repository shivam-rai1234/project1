package com.KPI.LibraryWebApplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String Title;
	private String Author;
	private String ISBN;
	private Integer Publishing_year;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(Integer id, String title, String author, String iSBN, Integer publishing_year) {
		super();
		this.id = id;
		Title = title;
		Author = author;
		ISBN = iSBN;
		Publishing_year = publishing_year;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Integer getPublishing_year() {
		return Publishing_year;
	}
	public void setPublishing_year(Integer publishing_year) {
		Publishing_year = publishing_year;
	}

}
