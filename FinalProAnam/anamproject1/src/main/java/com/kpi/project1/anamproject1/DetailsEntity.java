package com.kpi.project1.anamproject1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")

public class DetailsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer sr_no;
	private String terms;
	private String description;
	public Integer getSr_no() {
		return sr_no;
	}
	public void setSr_no(Integer sr_no) {
		this.sr_no = sr_no;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
