package com.example.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.models.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getEmployeeList() {

		List<Employee> list = new ArrayList<Employee>();
		Employee e = new Employee("485746", "Employee", new Date(), "Employee", 123, "Test Employee", "O+");
		Employee e1 = new Employee("485747", "Employee1", new Date(), "Manager", 123, "Test Employee", "B+");
		Employee e2 = new Employee("485748", "Employee2", new Date(), "Director", 123, "Test Employee", "A+");
		Employee e3 = new Employee("485741", "Employee3", new Date(), "Employee", 123, "Test Employee", "AB+");
		Employee e4 = new Employee("485742", "Employee4", new Date(), "Manager", 123, "Test Employee", "AB+");
		Employee e5 = new Employee("485743", "Employee5", new Date(), "CEO", 123, "Test Employee", "B+");
		Employee e6 = new Employee("485744", "Employee6", new Date(), "HR", 123, "Test Employee", "O-");
		Employee e7 = new Employee("485745", "Employee7", new Date(), "Employee", 123, "Test Employee", "O+");
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		return list;
	}

}
