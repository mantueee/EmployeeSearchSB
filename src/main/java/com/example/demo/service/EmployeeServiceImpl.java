package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dao.EmployeeDaoImpl;
import com.example.demo.models.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDaoImpl;

	@Override
	public List<Employee> getEmployeeList() {
		


		return employeeDaoImpl.getEmployeeList();
	}

}
