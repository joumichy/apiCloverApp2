package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="newschema.test_watch")
public class MyEntity {
	@Id
	@Column(name="watch_id")
	private String watch_id;
	
	@Column(name="watch_name")
	private String watch_name;
	
	@Column(name="watch_path")
	private String watch_path;
	
	public String getWatch_id() {
		return watch_id;
	}

	public void setWatch_id(String watch_id) {
		this.watch_id = watch_id;
	}

	public String getWatch_name() {
		return watch_name;
	}

	public void setWatch_name(String watch_name) {
		this.watch_name = watch_name;
	}

	public String getWatch_path() {
		return watch_path;
	}

	public void setWatch_path(String watch_path) {
		this.watch_path = watch_path;
	}

	
	

}
