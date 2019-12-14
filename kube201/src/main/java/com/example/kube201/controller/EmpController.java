package com.example.kube201.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@Autowired
	EmployeeRepository repository;
	
	@RequestMapping(path = "/getEmployee", method = RequestMethod.GET)
	public List<Employee> getEmployee() {
		return (List<Employee>)repository.findAll();
	}
	
	@RequestMapping(path = "/save", method = RequestMethod.GET)
	public Employee saveEmployee() {
		Employee emp = new Employee();
		emp.setName("SampUser");
		emp.setDept("sales");
		emp.setSalary(3500L);
		return repository.save(emp);
	}

}
