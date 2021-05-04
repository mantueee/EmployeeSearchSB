package com.example.demo.models;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String id;
	String name;
	Date date;
	String designation;
	double salary;
	String address;
	String bloodGroup;

	public Employee(String id, String name, Date date, String designation, double salary, String address,
			String bloodGroup) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
		this.bloodGroup = bloodGroup;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
