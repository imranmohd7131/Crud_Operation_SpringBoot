package com.tuespot.model;

public class StudentFormModel {
	
	private Long id ;
	private String name;
	private String fatherName;
	private String motherName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "StudentFormModel [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", motherName="
				+ motherName + "]";
	}
	public StudentFormModel(Long id, String name, String fatherName, String motherName) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	public StudentFormModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
