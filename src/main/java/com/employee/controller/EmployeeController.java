package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.EmployeeModel;
import com.employee.repository.EmployeeJPARepository;

//soap
//data format exchange
//xml,html,JSON
@RestController//spring web dependency
@RequestMapping("/agreeyaEmployee")
public class EmployeeController {
	
	
	//dependency injection
	@Autowired
	EmployeeJPARepository employeeRepo;
	
	//test controller
	@GetMapping("/EmployeeController/{id}/{name}")
	public String testMethod(@PathVariable("id") Integer id,@PathVariable("name") String name)
	{
		return "this is test controller.."+id+"name is..."+name;
	}
	
	//insert employeeinfo into db
	@PostMapping("/insertEmployeeInfo")
	public EmployeeModel insertEmployeeInfo(@RequestBody EmployeeModel employeeModel)
	{
		return employeeRepo.save(employeeModel);
	}
	
	//get all employee
	@GetMapping("/getallEmployee")
	public List<EmployeeModel>  getEmployeeInfo()
	{
		return employeeRepo.findAll();
	}
	
	@GetMapping("/getallEmployee/{id}")
	public EmployeeModel getEmployeeInfoByEmpId(@PathVariable("id") Integer id)
	{
		return employeeRepo.findByEmpId(id);
	}
	
	
	//update
	
	
	
	
	
	
	//delete
	

}
