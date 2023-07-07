package com.tuespot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuespot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
