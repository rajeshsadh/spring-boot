/**
 * 
 */
package com.spring.boot.model;

/**
 * @author Rajesh Sadh
 *
 */
public class Employee {
	
	private int empId;
	private String name;
	private String email;
	private long mobile;

	
	public Employee(int empId, String name, String email, long mobile) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}