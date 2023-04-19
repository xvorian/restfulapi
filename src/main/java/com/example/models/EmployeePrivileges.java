package com.example.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_privileges")
public class EmployeePrivileges implements Serializable{
	
	@Id
	@Column(name="employee_id")
	private Integer employee_id;
	
	@Id
	@Column(name="privilege_id")
	private Integer privilege_id;

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public Integer getPrivilege_id() {
		return privilege_id;
	}

	public void setPrivilege_id(Integer privilege_id) {
		this.privilege_id = privilege_id;
	}
	
}
