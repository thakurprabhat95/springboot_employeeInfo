package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.EmployeeModel;

//this interface used to save data(many methods...)
@Repository
public interface EmployeeJPARepository extends JpaRepository<EmployeeModel, Integer>{

	EmployeeModel findByEmpId(Integer id);

}
