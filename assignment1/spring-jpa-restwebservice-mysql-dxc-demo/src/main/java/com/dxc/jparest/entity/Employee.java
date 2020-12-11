package com.dxc.jparest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee{

	@Column(name = "employee_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employee_id;

	@Column(name = "employee_name", nullable = true, length = 255)
	private String employee_name;

	@Column(name = "employee_age", nullable = true, length = 255)
	private Integer employee_age;

	@Column(name = "employee_address", nullable = true, length = 5000)
	private String employee_address;

	@Column(name = "employee_email", nullable = true, length = 255)
	private String employee_email;
	
	@Column(name = "employee_phoneno", nullable = true, length = 255)
	private Integer employee_phoneno;

	public Employee() {
		super();
	}

	
	public Employee(Integer employee_id, String employee_name, Integer employee_age, String employee_address,
			String employee_email, Integer employee_phoneno) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_age = employee_age;
		this.employee_address = employee_address;
		this.employee_email = employee_email;
		this.employee_phoneno = employee_phoneno;
	}	
	

	public Integer getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}


	public String getEmployee_name() {
		return Employee_name;
	}


	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}


	public Integer getEmployee_age() {
		return employee_age;
	}


	public void setEmployee_age(Integer employee_age) {
		this.employee_age = employee_age;
	}


	public String getEmployee_address() {
		return employee_address;
	}


	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}


	public String getEmployee_email() {
		return employee_email;
	}


	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}


	public Integer getEmployee_phoneno() {
		return Employee_phoneno;
	}


	public void setEmployee_phoneno(Integer employee_phoneno) {
		this.employee_phoneno = employee_phoneno;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_age="
				+ employee_age + ", employee_address=" + employee_address + ", employee_email=" + employee_email
				+ ", employee_phoneno=" + employee_phoneno + "]";
	}
	
}
