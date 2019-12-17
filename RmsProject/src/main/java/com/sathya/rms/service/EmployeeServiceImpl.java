package com.sathya.rms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.EmployeeRepository;
import com.sathya.rms.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Transactional
	public Employee insertEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Transactional
	public Employee updateEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Transactional
	public void deleteEmployee(Integer id) {

		employeeRepository.deleteById(id);

	}

	@Override
	public Iterable<Employee> getAllEmployee() {

		return employeeRepository.findAll();
	}

}
