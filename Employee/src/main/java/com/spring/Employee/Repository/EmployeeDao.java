package com.spring.Employee.Repository;

import java.util.ArrayList;

import com.spring.Employee.model.Employee;

public interface EmployeeDao {
	
 public void createEmployee(Employee emp);
 public ArrayList<Employee> getAllEmployee();
 public Employee getEmployeeById(int Id);
 public void updateEmployee(Employee emp);
 public void deleteEmployee(Employee emp);
}
