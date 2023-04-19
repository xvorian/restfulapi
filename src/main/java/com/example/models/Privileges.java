package com.example.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="privileges")
public class Privileges implements Serializable{
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="privilege_name")
	private Long privilege_name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPrivilege_name() {
		return privilege_name;
	}

	public void setPrivilege_name(Long privilege_name) {
		this.privilege_name = privilege_name;
	}
}
