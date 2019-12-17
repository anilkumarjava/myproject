package com.sathya.rms.service;

import org.springframework.stereotype.Service;

import com.sathya.rms.entity.Employee;

@Service
public interface EmployeeService {

	public Employee insertEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(Integer id);

	public Iterable<Employee> getAllEmployee();

}
