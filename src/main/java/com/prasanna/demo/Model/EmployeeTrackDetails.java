package com.prasanna.demo.Model;

import java.util.Date;

public class EmployeeTrackDetails {
	private int trackingID;
	private Date swipeIn;
	private Date swipeOut;
	private String locationName;
	private String swipingType;
	private int empId;
	public int getTrackingID() {
		return trackingID;
	}
	public void setTrackingID(int trackingID) {
		this.trackingID = trackingID;
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
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getSwipingType() {
		return swipingType;
	}
	public void setSwipingType(String swipingType) {
		this.swipingType = swipingType;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public EmployeeTrackDetails(int trackingID, Date swipeIn, Date swipeOut, String locationName, String swipingType,
			int empId) {
		super();
		this.trackingID = trackingID;
		this.swipeIn = swipeIn;
		this.swipeOut = swipeOut;
		this.locationName = locationName;
		this.swipingType = swipingType;
		this.empId = empId;
	}
	public EmployeeTrackDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
