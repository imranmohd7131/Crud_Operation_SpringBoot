package com.tuespot.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.entity.StudentFormEntity;
import com.tuespot.model.StudentFormModel;
import com.tuespot.service.StudentFormService;

@RestController
@RequestMapping("/studentFrom")
@CrossOrigin
public class StudentFormController {

	@Autowired
	StudentFormService service;

	@GetMapping("/get")
	public List<StudentFormEntity> getData() {
		List<StudentFormEntity> data = this.service.getData();
		return data;
	}

	@GetMapping("/getById")
	public ResponseEntity<?> getById(@RequestParam("id") long id) {
		StudentFormEntity findById = this.service.findById(id);
		return new ResponseEntity<StudentFormEntity>(findById, HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<?> insertData(@RequestBody StudentFormModel studentFormModel) {
		StudentFormModel insertData = this.service.insertData(studentFormModel);
		return new ResponseEntity<StudentFormModel>(insertData, HttpStatus.OK);
	}

	@PutMapping("/update")
	public StudentFormEntity updateData(@RequestBody StudentFormEntity entity) {
		StudentFormEntity updateData = this.service.updateData(entity);
		return updateData;
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteById(@RequestParam("id") int id) {
		String deleteById=this.service.deleteById(id);
		System.out.println();
//		if (deleteById !=null) {
			return new ResponseEntity<String>("Data deleted successfully", HttpStatus.OK);
//		} else {
		//	return new ResponseEntity<String>("data not present", HttpStatus.OK);
		//}
	}

}
