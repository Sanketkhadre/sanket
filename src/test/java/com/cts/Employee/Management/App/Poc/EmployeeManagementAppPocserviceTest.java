/*
 * package com.cts.Employee.Management.App.Poc;
 * 
 * import static org.junit.jupiter.api.Assertions.*; import static
 * org.mockito.Mockito.times; import static org.mockito.Mockito.verify; import
 * static org.mockito.Mockito.when;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * import org.junit.jupiter.api.BeforeEach; import org.junit.jupiter.api.Test;
 * import org.mockito.Mock; import org.mockito.MockitoAnnotations; import
 * org.mockito.verification.VerificationMode; import
 * org.springframework.data.repository.CrudRepository;
 * 
 * import com.cts.Employee.Management.App.Poc.entity.Employeedetails; import
 * com.cts.Employee.Management.App.Poc.repo.Employeerepo; import
 * com.cts.Employee.Management.App.Poc.service.Employeeservice;
 * 
 * 
 * 
 * class EmployeeManagementAppPocserviceTest {
 * 
 * @Mock Employeeservice service;
 * 
 * private Employeerepo repo;
 * 
 * @BeforeEach public void setup() { MockitoAnnotations.openMocks(this);
 * 
 * }
 * 
 * @Test void testAddDetails() { Employeedetails employee=new Employeedetails();
 * when(service.adddetail(employee)).thenReturn(employee); Employeedetails
 * actualResponse=service.adddetail(employee); assertNotNull(actualResponse); }
 * 
 * @Test void testgetallemployeedetail() { List<Employeedetails>
 * result=service.getallemployeedetail(); assertNotNull(result); }
 * 
 * @Test void testfindbyname() { List<Employeedetails>
 * result=service.findbyname("Tejal Kothavade"); assertNotNull(result);
 * 
 * }
 * 
 * @Test void testfindbyid() { Optional<Employeedetails>
 * result=service.findbyid(2139148); assertNotNull(result);
 * 
 * 
 * }
 * 
 * @Test void testupdatebyid() { Employeedetails employee=new Employeedetails();
 * int id=2139147; when(service.updatedetails(employee,
 * id)).thenReturn(employee); Employeedetails
 * result=service.updatedetails(employee, id); assertNotNull(result);
 * 
 * 
 * }
 * 
 * }
 */