package com.FinalProject_Piyush.FinalProject_Piyush;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author PiyushBodhani
 *
 */
@Entity
@Table(name = "dbdetails")
public class dbdetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "db_id")
	private int db_id;
	@Column(name = "db_name")
	private String db_name;
	@Column(name = "db_links")
	private String db_links;

	public int getDb_id() {
		return db_id;
	}

	public void setDb_id(int db_id) {
		this.db_id = db_id;
	}

	public String getDb_name() {
		return db_name;
	}

	public void setDb_name(String db_name) {
		this.db_name = db_name;
	}

	public String getDb_links() {
		return db_links;
	}

	public void setDb_links(String db_links) {
		this.db_links = db_links;
	}

}
