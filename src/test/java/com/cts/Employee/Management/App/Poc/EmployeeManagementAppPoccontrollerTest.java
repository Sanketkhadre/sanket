//package com.cts.Employee.Management.App.Poc;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//import java.sql.Date;
//import java.util.List;
//import java.util.Optional;
//import java.util.logging.Logger;
//
//import org.assertj.core.util.Arrays;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import com.cts.Employee.Management.App.Poc.controller.Employeecontroller;
//import com.cts.Employee.Management.App.Poc.entity.Employeedetails;
//import com.cts.Employee.Management.App.Poc.service.Employeeservice;
//
//class EmployeeManagementAppPoccontrollerTest {
//	@Mock
//	Employeeservice service;
//	@InjectMocks
//	Employeecontroller controller;
//	@Mock
//	Logger logger;
//	@BeforeEach
//	void setup() {
//		MockitoAnnotations.openMocks(this);
//	}
//	@Test
//	void testAddDetails() {
//		Employeedetails employee=new Employeedetails();
//		when(service.adddetail(employee)).thenReturn(employee);
//		Employeedetails actualResponse=controller.adddetails(employee);
//		assertNotNull(actualResponse);
//	}
////	@Test
////	void testgetallemployeedetail() {
////		List<Employeedetails> result=controller.getallemployeedetail();
////		assertNotNull(result);
////	}
//	
//	@Test
//	void testfindbyname() {
//		List<Employeedetails> result=controller.findbyname("Tejal Kothavade");
//		assertNotNull(result);
//		
//	}
//	@Test
//	void testfindbyid() {
//		Optional<Employeedetails> result=controller.findbyid(2139148);
//		assertNotNull(result);
//		
//		
//	}
//	
//	@Test
//	void testupdatebyid() {
//		Employeedetails employee=new Employeedetails();
//		int id=2139147;
//		when(service.updatedetails(employee, id)).thenReturn(employee);
//		Employeedetails result=controller.updatedetails(employee, id);
//		assertNotNull(result);
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//	
//}
