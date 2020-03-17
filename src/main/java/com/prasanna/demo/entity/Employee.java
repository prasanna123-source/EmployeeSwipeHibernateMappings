package com.prasanna.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int empId;
	String empName;	
	
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY,
          cascade = CascadeType.ALL)
    private Set<EmployeeSwipeTracking> employeeActivities;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Employee(int empId, String empName, Set<EmployeeSwipeTracking> employeeActivities) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.employeeActivities = employeeActivities;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
		
	public Set<EmployeeSwipeTracking> getEmployeeActivities() {
		return employeeActivities;
	}
	public void setEmployeeActivities(Set<EmployeeSwipeTracking> employeeActivities) {
		this.employeeActivities = employeeActivities;
	}
	public Employee() {		
		// TODO Auto-generated constructor stub
	}

	
}
