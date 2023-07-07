package com.tuespot.service;

import java.util.List;

import com.tuespot.entity.StudentFormEntity;
import com.tuespot.model.StudentFormModel;

public interface StudentFormService {

	public StudentFormModel insertData(StudentFormModel model);
	
	List<StudentFormEntity> getData();
	
	StudentFormEntity findById(long id);

	StudentFormEntity updateData( StudentFormEntity entity);
	
	String deleteById(long id);
	
}
