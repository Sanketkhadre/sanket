package com.cts.Employee.Management.App.Poc.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cts.Employee.Management.App.Poc.entity.Employeedetails;
import com.cts.Employee.Management.App.Poc.exception.ResourcesNotFoundException;
import com.cts.Employee.Management.App.Poc.repo.Employeerepo;

@Service
public class Employeeservice {
	@Autowired
	Employeerepo repo;
  
	public Employeedetails adddetail(Employeedetails employee) {
		return this.repo.save(employee);
	}

	public List<Employeedetails> getallemployeedetail() {
		return this.repo.findAll();

	}

	public Employeedetails updatedetails(Employeedetails employee, int id) {
		return this.repo.save(employee);
		
	}

	

	public Employeedetails findbyid(int id) {

	        return this.repo.findById(id).orElseThrow(() -> new ResourcesNotFoundException(" Invalid Employee Id, Please Enter Valid Emp Id ",id, "id"));    }

	


	public List<Employeedetails> findbyname(String name) {
		return this.repo.findByNameEquals(name);
	}

	public void deleteemployeebyid(int id) {
		repo.deleteById(id);
	}

}
