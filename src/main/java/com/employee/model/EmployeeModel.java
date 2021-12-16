package com.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employeeInfo")
public class EmployeeModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	
	private String empName;
	private String empMobNo;
	
	//getter and setter
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
	public String getEmpMobNo() {
		return empMobNo;
	}
	public void setEmpMobNo(String empMobNo) {
		this.empMobNo = empMobNo;
	}
	
	
	
	
	
	
	

}
