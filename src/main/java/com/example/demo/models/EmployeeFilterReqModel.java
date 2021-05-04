package com.example.demo.models;

import java.io.Serializable;

public class EmployeeFilterReqModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String fieldName;
	String fieldOrder;
	String filterValue;

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldOrder() {
		return fieldOrder;
	}

	public void setFieldOrder(String fieldOrder) {
		this.fieldOrder = fieldOrder;
	}

	public String getFilterValue() {
		return filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

}
