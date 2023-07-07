package com.tuespot.ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.customexceptions.ResourceNotFoundException;
import com.tuespot.customexceptions2.DataNotFoundException;
import com.tuespot.entity.Employee;
import com.tuespot.entity.User;
import com.tuespot.model.EmployeeModel;
import com.tuespot.repository.EmployeeRepository;
import com.tuespot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeModel saveEmployee(EmployeeModel employeeModel) {
		Employee employee = new Employee();
		employee.setDesc(employeeModel.getDesc());
		employee.setEmp_loc(employeeModel.getEmp_loc());
		employee.setEmp_name(employeeModel.getEmp_name());
		Employee save = this.employeeRepository.save(employee);

		EmployeeModel response = new EmployeeModel();
		response.setId(save.getId());
		response.setDesc(save.getDesc());
		response.setEmp_loc(save.getEmp_loc());
		response.setEmp_name(save.getEmp_name());
		return response;
	}

	@Override
	public EmployeeModel updateEmployee(EmployeeModel employeeModel) {
		Employee employee = new Employee();
		employee.setId(employeeModel.getId());
		employee.setDesc(employeeModel.getDesc());
		employee.setEmp_loc(employeeModel.getEmp_loc());
		employee.setEmp_name(employeeModel.getEmp_name());
		Employee save = this.employeeRepository.save(employee);

		EmployeeModel response = new EmployeeModel();
		response.setId(save.getId());
		response.setDesc(save.getDesc());
		response.setEmp_loc(save.getEmp_loc());
		response.setEmp_name(save.getEmp_name());
		return response;
	}

	@Override
	public List<EmployeeModel> getEmployees() {
		List<Employee> findAll = this.employeeRepository.findAll();
		List<EmployeeModel> respList = new ArrayList<EmployeeModel>();
		findAll.forEach(data -> {
			EmployeeModel response = new EmployeeModel();
			response.setId(data.getId());
			response.setDesc(data.getDesc());
			response.setEmp_loc(data.getEmp_loc());
			response.setEmp_name(data.getEmp_name());
			respList.add(response);
		});
		return respList;
	}

	@Override
	public EmployeeModel getById(Long emp_Id) {
		Employee employee = this.employeeRepository.findById(emp_Id)
				.orElseThrow(() -> new DataNotFoundException("data not found with this userId" + emp_Id));
		EmployeeModel response = new EmployeeModel();
		response.setId(employee.getId());
		response.setDesc(employee.getDesc());
		response.setEmp_loc(employee.getEmp_loc());
		response.setEmp_name(employee.getEmp_name());

		return response;
	}

	@Override
	public Map<String, String> deleteById(Long emp_Id) {
		Employee findById = this.employeeRepository.findById(emp_Id)
				.orElseThrow(() -> new DataNotFoundException("data not found with this userId" + emp_Id));
		this.employeeRepository.deleteById(emp_Id);

		Map<String, String> resp = new HashMap<String, String>();
		resp.put("message", "User Deleted Successfully");
		return resp;
	}

}
