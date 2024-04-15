package com.cts.Employee.Management.App.Poc.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.Employee.Management.App.Poc.entity.Employeedetails;

@Repository
public interface Employeerepo extends JpaRepository<Employeedetails,Integer> {

	List<Employeedetails> findByNameEquals(String name);
	

	

	
}
