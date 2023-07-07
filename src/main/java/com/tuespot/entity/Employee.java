package com.tuespot.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String emp_name;
	@Column(name="emp_Loc",length = 50)
	private String emp_loc;
	@Column(name="emp_desc",columnDefinition = "TEXT")
	private String desc;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", emp_loc=" + emp_loc + ", desc=" + desc + "]";
	}
		
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String emp_name, String emp_loc, String desc) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.emp_loc = emp_loc;
		this.desc = desc;
	}




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
	
	
	
}
