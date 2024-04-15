package com.cts.Employee.Management.App.Poc;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.ActiveProfiles;
import com.cts.Employee.Management.App.Poc.entity.Employeedetails;
import com.cts.Employee.Management.App.Poc.repo.Employeerepo;


@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@SpringBootTest(classes = EmployeeManagementAppPocApplication.class)
class EmployeeManagementAppPocrepoTest {
	@Autowired
	Employeerepo repo;
	
	
    @Test
	void testfindbynameequals() {
    	 ArrayList<Employeedetails> em1 = new ArrayList<Employeedetails>();

         em1.add(new Employeedetails(2139147,"Tejal Kothavade","2139147@cts.com",

                 LocalDate.of(2022, 02,10),"8767567899"));
         em1.add(new Employeedetails(2139148,"madhu","2139147@cts.com",

                 LocalDate.of(2022, 02,10),"8767567899"));
         repo.saveAll(em1);
         
         List<Employeedetails> e =repo.findByNameEquals("Tejal Kothavade");

         System.out.println(e);

         assertEquals(1,e.size());
    	
    
    
         
     
        
         
         

		
    }
    
  
	

}
