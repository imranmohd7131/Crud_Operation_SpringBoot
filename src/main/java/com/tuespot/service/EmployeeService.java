package com.tuespot.service;

import java.util.List;
import java.util.Map;

import com.tuespot.model.EmployeeModel;

public interface EmployeeService {
	
	public EmployeeModel saveEmployee(EmployeeModel employeeModel);
	
	public EmployeeModel updateEmployee(EmployeeModel employeeModel);
	
	public List<EmployeeModel> getEmployees();
	
	public EmployeeModel getById(Long emp_Id);
	
	public Map<String, String> deleteById(Long emp_Id);
	
	

}
