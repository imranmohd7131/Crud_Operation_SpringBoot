package com.tuespot.model;

import javax.persistence.Column;

public class EmployeeModel {
	
	private Long id;
	private String emp_name;
	private String emp_loc;
	private String desc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_loc() {
		return emp_loc;
	}
	public void setEmp_loc(String emp_loc) {
		this.emp_loc = emp_loc;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", emp_name=" + emp_name + ", emp_loc=" + emp_loc + ", desc=" + desc + "]";
	}
	public EmployeeModel(Long id, String emp_name, String emp_loc, String desc) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.emp_loc = emp_loc;
		this.desc = desc;
	}
	public EmployeeModel() {
		super();
	}
	
	

}
