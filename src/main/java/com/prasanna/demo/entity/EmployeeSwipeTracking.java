package com.prasanna.demo.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="employeeSwipe_activity")
public class EmployeeSwipeTracking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empSwipeId;
	
	private String locationName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date swipeIn;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date swipeOut;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date swipeCreatedDate;
	
//	@ManyToOne(fetch = FetchType.LAZY, optional = false) 
//	@JoinColumn(name ="empId" ,nullable=false)
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_Id", insertable = false, updatable = false)
	@JsonIgnoreProperties
    private Employee employee;
	

	public Integer getEmpSwipeId() {
		return empSwipeId;
	}

	public void setEmpSwipeId(Integer empSwipeId) {
		this.empSwipeId = empSwipeId;
	}

	public Date getSwipeIn() {
		return swipeIn;
	}

	public void setSwipeIn(Date swipeIn) {
		this.swipeIn = swipeIn;
	}

	public Date getSwipeOut() {
		return swipeOut;
	}

	public void setSwipeOut(Date swipeOut) {
		this.swipeOut = swipeOut;
	}

	public Date getSwipeCreatedDate() {
		return swipeCreatedDate;
	}

	public void setSwipeCreatedDate(Date swipeCreatedDate) {
		this.swipeCreatedDate = swipeCreatedDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}	

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public EmployeeSwipeTracking(Integer empSwipeId, String locationName, Date swipeIn, Date swipeOut,
			Date swipeCreatedDate, Employee employee) {		
		this.empSwipeId = empSwipeId;
		this.locationName = locationName;
		this.swipeIn = swipeIn;
		this.swipeOut = swipeOut;
		this.swipeCreatedDate = swipeCreatedDate;
		this.employee = employee;
	}

	public EmployeeSwipeTracking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
