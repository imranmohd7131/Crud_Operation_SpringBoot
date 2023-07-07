package com.tuespot.contoller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.model.EmployeeModel;
import com.tuespot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class Employee {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveEmployee(@RequestBody EmployeeModel employeeModel) {
		EmployeeModel saveEmployee = this.employeeService.saveEmployee(employeeModel);
		return new ResponseEntity<EmployeeModel>(saveEmployee,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateEmployee(@RequestBody EmployeeModel employeeModel) {
		EmployeeModel updateEmployee = this.employeeService.updateEmployee(employeeModel);
		return new ResponseEntity<EmployeeModel>(updateEmployee,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getEmployees(){
		List<EmployeeModel> employees = this.employeeService.getEmployees();
		return new ResponseEntity<List<EmployeeModel>>(employees,HttpStatus.OK);
		
	}
	
	@GetMapping("/get/by")
	public ResponseEntity<?> getById(@RequestParam("id") Long id){
		 EmployeeModel byId = this.employeeService.getById(id);
		return new ResponseEntity<EmployeeModel>(byId,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/by")
	public ResponseEntity<?> deleteById(@RequestParam("id") Long id){
		 Map<String, String> deleteById = this.employeeService.deleteById(id);
		return new ResponseEntity< Map<String, String>>(deleteById,HttpStatus.OK);
		
	}
	
	
	

}
