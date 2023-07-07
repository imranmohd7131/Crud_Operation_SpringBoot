package com.tuespot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentFormEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String name;
	private String fatherName;
	private String motherName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
		return "StudentFormEntity [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", motherName="
				+ motherName + "]";
	}
	public StudentFormEntity(long id, String name, String fatherName, String motherName) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	public StudentFormEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
