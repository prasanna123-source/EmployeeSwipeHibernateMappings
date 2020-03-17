package com.prasanna.demo.Model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeSwipeRequest {
    private Integer empId;	
    private String empName;
	private String locationName;	
	private Date swipeIn;		
	private Date swipeOut;	
	private Date swipeCreatedDate;
	private String swipingType;	
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="IST")
	private Date currDate;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
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

	public String getSwipingType() {
		return swipingType;
	}

	public void setSwipingType(String swipingType) {
		this.swipingType = swipingType;
	}

	public Date getCurrDate() {
		return currDate;
	}

	public void setCurrDate(Date currDate) {
		this.currDate = currDate;
	}	
	
}
