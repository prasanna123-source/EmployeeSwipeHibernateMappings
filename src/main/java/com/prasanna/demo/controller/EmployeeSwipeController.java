package com.prasanna.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prasanna.demo.dao.impl.EmployeeSwipeDaoImpl;
import com.prasanna.demo.entity.Employee;
import com.prasanna.demo.exceptionHandler.CustomException;

@RestController
public class EmployeeSwipeController {

	@Autowired
	EmployeeSwipeDaoImpl employeeSwipeDao;
    
	
	
	@PostMapping(value = "/saveEmployee")
	public ResponseEntity<Employee> save(@RequestBody Employee emp) {		  
		return new ResponseEntity<>(employeeSwipeDao.addEmployee(emp), HttpStatus.ACCEPTED);    
	}
  
	@GetMapping(value = "/getEmployees")
	public List<Employee> listEmployees(Model model) {
		List<Employee> empList = employeeSwipeDao.getAllEmployees();
		if (!empList.isEmpty()) {
			model.addAttribute("employees", empList);
		} else {
			throw new CustomException("Employee record Not found");
		}
		return empList;
	}

	@GetMapping(value = "/getEmployeeByID/{empId}")
	public Employee getEmployeeById(@PathVariable(name = "empId") int empId) {

		return employeeSwipeDao.getEmployeeById(empId);
	}
	
//	@RequestMapping(value = "/registerSwipe", method = RequestMethod.POST)
//	public ResponseEntity<String> registerEmployeeSwiping(@RequestBody Employee  request) {
//		return new ResponseEntity<>(request.registerEmployeeSwiping(request), HttpStatus.ACCEPTED);
//	}


}
