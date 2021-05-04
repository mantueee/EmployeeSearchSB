package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.models.EmployeeFilterReqModel;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employeeList")
public class EmployeeRestController {
	@Autowired
	private EmployeeService empService;

	@GetMapping("/getEmployee")
	public List<Employee> getEmployee() {

		return empService.getEmployeeList();
	}

	@PostMapping("/getFilteredEmployee")
	public Object getFilteredEmployee(EmployeeFilterReqModel req) {

		if (!StringUtils.hasText(req.getFieldName()) || !StringUtils.hasText(req.getFilterValue())) {

			throw new RuntimeException("Mandatory Fields are missing");

		}

		List<Employee> empList = empService.getEmployeeList();

		switch (req.getFieldName()) {
		case "name":
			String filterValue = req.getFilterValue();
			if (StringUtils.hasText(filterValue)) {
				Map<String, List<String>> map = empList.stream().filter(emp -> emp.getName().contentEquals(filterValue))
						.collect(Collectors.groupingBy(e -> e.getId(),
								Collectors.mapping(e -> e.getName(), Collectors.toList())));
				return map;
			}

			break;

		case "Salary": {
			List<Employee> salList = null;
			if (req.getFieldOrder().equalsIgnoreCase("greater")) {
				 empList.stream()
					.filter(emp -> emp.getSalary() > Double.valueOf(req.getFilterValue()))
					.sorted((a, b) -> (int) a.getSalary() - (int) b.getSalary()).collect(Collectors.toList());
				
			} else {
				empList.stream()
				.filter(emp -> emp.getSalary() < Double.valueOf(req.getFilterValue()))
				.sorted((a, b) -> (int) a.getSalary() - (int) b.getSalary()).collect(Collectors.toList());
			}
			
			return salList;
		}
		
		case "bloodGroup": {
			List<Employee> employeeList = null;
			Map<String, List<String>> map = empList.stream().filter(p -> p.getBloodGroup().equalsIgnoreCase(req.getFilterValue()))
					.collect(Collectors.groupingBy(e -> e.getId(),
							Collectors.mapping(e -> e.getBloodGroup(), Collectors.toList())));
			return employeeList;
		}

		default:
			return empList;
		}

		return empService.getEmployeeList();
	}

}
