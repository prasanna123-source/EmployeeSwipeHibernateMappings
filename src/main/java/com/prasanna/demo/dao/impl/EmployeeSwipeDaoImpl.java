package com.prasanna.demo.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasanna.demo.Model.EmployeeSwipeRequest;
import com.prasanna.demo.Model.EmployeeTrackDetails;
import com.prasanna.demo.entity.Employee;
import com.prasanna.demo.service.EmployeeSwipeTrackingService;

@Service
@Transactional
public class EmployeeSwipeDaoImpl implements EmployeeSwipeTrackingService {
	
	@Autowired
	SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	private static SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");

	Logger logger = LoggerFactory.getLogger(EmployeeSwipeDaoImpl.class);

	public Employee addEmployee(Employee employee) {
		// sessionFactory.getCurrentSession().persist(user);
		sessionFactory.getCurrentSession().save(employee);
		return Objects.nonNull(employee) && Objects.nonNull(employee.getEmpId()) ? employee : null;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> resultList = getSession().createQuery("from Employee", Employee.class).getResultList();
		return resultList;
	}

	public Employee getEmployeeById(int id) {
		return (Employee) getSession().get(Employee.class, id);
	}

	public Employee updateEmployee(Employee employee, int id) {
		if (Objects.nonNull(employee) && Objects.nonNull(employee.getEmpId())) {
			sessionFactory.getCurrentSession().saveOrUpdate(employee);
		} else {
			throw new RuntimeException();
		}
		return employee;
	}
	
	 
//	public String registerEmployeeSwiping(EmployeeSwipeRequest request) {
//		EmployeeTrackDetails timeTracking = new EmployeeTrackDetails();
//
//		try {
//			timeTracking.setSwipingType(request.getSwipingType());
//
//			if (request.getSwipingType().equalsIgnoreCase("IN")) {
//				timeTracking.setSwipeIn(dateTimeFormatter.parse(request.getSwipeIn()));
//			} else if (request.getSwipingType().equalsIgnoreCase("OUT")) {
//				timeTracking.setSwipeOut(dateTimeFormatter.parse(request.getSwipeOut()));
//			}
//			request.setCurrDate(dateTimeFormatter.parse(request.getCurrDate()));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//
//		timeTracking.setLocationName(request.getLocationName());

//		dao.saveEmployee(request, timeTracking);
//		return "Date Saved Successfully...";
//	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
