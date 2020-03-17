package com.prasanna.demo.service;

import java.util.List;

import com.prasanna.demo.entity.Employee;

public interface EmployeeSwipeTrackingService {
	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getById(int id);
	public Employee updateEmployee(Employee employee, int id);
}
