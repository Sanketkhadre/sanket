package com.cts.Employee.Management.App.Poc.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "employeedetail")
public class Employeedetails {
	@Id
	@NotNull(message = "Please enter empid ")
    private int empid;
	@NotNull(message = "Please enter name ")
	private String name;
	
	
	@Email(message = "enter valid email")
	private String email;
    @Past
	@JsonFormat(pattern = "MM/dd/yyyy")
	@NotNull(message = "Please enter dateofjoining ")
	
	private LocalDate dateofjoining;
	//@Pattern(regexp = "[6-9]{1}[0-9]{9}", message = "enter valid contactnumber")
	@NotEmpty
    @Pattern(regexp="(^$|[0-9]{10})", message="PhoneNumber should have 10 digits")
	private String contactnumber;
	public Employeedetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employeedetails(@NotNull(message = "Please enter empid ") int empid,
			@NotNull(message = "Please enter name ") String name, @Email(message = "enter valid email") String email,
			@NotNull(message = "Please enter dateofjoining ") LocalDate dateofjoining,
			@NotEmpty @Pattern(regexp = "(^$|[0-9]{10})", message = "PhoneNumber should have 10 digits") String contactnumber) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.dateofjoining = dateofjoining;
		this.contactnumber = contactnumber;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(LocalDate dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	@Override
	public String toString() {
		return "Employeedetails [empid=" + empid + ", name=" + name + ", email=" + email + ", dateofjoining="
				+ dateofjoining + ", contactnumber=" + contactnumber + "]";
	}
	
	
	
	
	
	
	
	

	



	

}
