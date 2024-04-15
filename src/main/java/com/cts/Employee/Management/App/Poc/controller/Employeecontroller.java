package com.cts.Employee.Management.App.Poc.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.websocket.OnMessage;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Employee.Management.App.Poc.entity.Employeedetails;
import com.cts.Employee.Management.App.Poc.logger.GlobalResources;
import com.cts.Employee.Management.App.Poc.service.Employeeservice;

@RestController
public class Employeecontroller {

	private Logger logger = GlobalResources.getLogger(Employeecontroller.class);

	@Autowired
	Employeeservice service;

	@PostMapping("/employeedetail")
	public ResponseEntity<Optional<Employeedetails>> adddetails(@Valid @RequestBody Employeedetails employee) {
		String methodName = "adddetails()";
		logger.info(methodName + "called");
		String message = "Employee details added succesfully!";
		logger.info(message);
		System.out.println(message);
		Employeedetails emp = null;
		try {
			emp = this.service.adddetail(employee);
			return ResponseEntity.ok(Optional.of(emp));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}

	}

	@GetMapping("/employeedetail")
	public ResponseEntity<List<Employeedetails>> getallemployeedetail() {
		String methodname = "getallemployeedetail()";
		logger.info(methodname + "called");
//		return this.service.getallemployeedetail();
		List<Employeedetails> emp = service.getallemployeedetail();
		if (emp.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(emp));
	}
	
	

	@PutMapping("/employeedetail/{id}")
	public ResponseEntity<Optional<Employeedetails>> updatedetails(@Valid  @RequestBody Employeedetails employee,
			@PathVariable("id") int id) {
		String methodName = "updatedetails()";
		logger.info(methodName + "called");
		logger.info(methodName + "called");
		String message = "Employee details update succesfully!";
		logger.info(message);
//		
		Employeedetails emp = null;
		try {
			emp = this.service.updatedetails(employee, id);
			return ResponseEntity.ok(Optional.of(emp));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}



	@GetMapping("/employeedetail/{id}")
    public Employeedetails findbyid(@PathVariable("id") int id) {
        String methodName = "findbyid()";
        logger.info(methodName + "called");
        return this.service.findbyid(id);
    }
	
	@GetMapping("employeedetail/name/{name}")
	public ResponseEntity<List<Employeedetails>> findbyname(@PathVariable("name") String name) {
		String methodName = "findbyname()";
		logger.info(methodName + "called");
//		return this.service.findbyname(name);
		List<Employeedetails> emp = service.findbyname(name);
		if (emp.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(emp));
	}

	@DeleteMapping("employeedetail/{id}")
	public ResponseEntity<Object> deleteemployeebyid(@PathVariable("id") int id) {
		String methodName = "deleteemployeebyid()";
		logger.info(methodName + "called");
		String message = "Employee details delete succesfully!";
		logger.info(message);
		System.out.println(message);
//		this.service.deleteemployeebyid(id);
		try {
		      service.deleteemployeebyid(id);
		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    } catch (Exception e) {
		      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		    }
	}

}
