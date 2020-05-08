/**
 * 
 */
package com.spring.boot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.Employee;

/**
 * @author Rajesh Sadh
 *
 */
@RestController
public class EmployeeController {
	
	@GetMapping("/employee")
	public ResponseEntity<Employee> getEmployee() {
		return new ResponseEntity<Employee>(new Employee(100,"Rajesh Sadh","rajeshsadh121@gmail.com",9030935891L), HttpStatus.OK);
	}
	
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		
		List<Employee> list = new ArrayList<Employee>(Arrays.asList(new Employee(100,"Rajesh Sadh","rajeshsadh121@gmail.com",9030935891L),new Employee(101,"Rakesh Sadh","rakeshsadh121@gmail.com",9030935891L),new Employee(102,"Niraj Sadh","nirajsadh121@gmail.com",9030935891L)));
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
}
