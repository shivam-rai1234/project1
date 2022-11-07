package com.embbeded_servers.project_sheetal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emdserver")
public class ServerEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer server_id;
	private String server_name;
	public Integer getServer_id() {
		return server_id;
	}
	public void setServer_id(Integer server_id) {
		this.server_id = server_id;
	}
	public String getServer_name() {
		return server_name;
	}
	public void setServer_name(String server_name) {
		this.server_name = server_name;
	}
}
		