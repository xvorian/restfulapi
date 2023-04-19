package com.example.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_privileges")
public class EmployeePrivileges implements Serializable{
	
	@Id
	@Column(name="employee_id")
	private Long employee_id;
	
	@Id
	@Column(name="privilege_id")
	private Long privilege_id;

	public Long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}

	public Long getPrivilege_id() {
		return privilege_id;
	}

	public void setPrivilege_id(Long privilege_id) {
		this.privilege_id = privilege_id;
	}
	
}
