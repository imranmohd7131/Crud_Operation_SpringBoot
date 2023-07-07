package com.tuespot.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.entity.StudentFormEntity;
import com.tuespot.model.StudentFormModel;
import com.tuespot.repository.StudentFormRepo;
import com.tuespot.service.StudentFormService;

@Service
public class StudentFormServiceImpl implements StudentFormService {

	@Autowired
	StudentFormRepo studentFormRepo;
	private StudentFormEntity findById;

	@Override
	public StudentFormModel insertData(StudentFormModel model) {

		StudentFormEntity entity = new StudentFormEntity();
		entity.setId(0);
		entity.setName(model.getName());
		entity.setFatherName(model.getFatherName());
		entity.setMotherName(model.getMotherName());
		StudentFormEntity save = this.studentFormRepo.save(entity);

		StudentFormModel studentFormModel = new StudentFormModel();
		studentFormModel.setId(save.getId());
		studentFormModel.setName(save.getName());
		studentFormModel.setFatherName(save.getFatherName());
		studentFormModel.setMotherName(save.getMotherName());

		return studentFormModel;
	}

	@Override
	public List<StudentFormEntity> getData() {

		List<StudentFormEntity> findAll = studentFormRepo.findAll();
		return findAll;
	}

	@Override
	public StudentFormEntity findById(long id) {
		 StudentFormEntity studentFormEntity = studentFormRepo.findById(id).get();

		return studentFormEntity;

	}

	@Override
	public StudentFormEntity updateData(StudentFormEntity entity) {
//		StudentFormEntity studentFormEntity = studentFormRepo.findById(entity.getId()).get();
//		System.err.println(studentFormEntity);
		 StudentFormEntity save = this.studentFormRepo.save(entity);
		return save;
	}

	@Override
	public String deleteById(long id) {
		this.studentFormRepo.deleteById(id);
		return null;
		
	}

}
