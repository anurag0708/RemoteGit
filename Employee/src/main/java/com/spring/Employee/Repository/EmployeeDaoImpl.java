package com.spring.Employee.Repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Employee.model.Employee;


@Transactional
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	 HibernateTemplate template;
	public void setTemplate(HibernateTemplate template)
	{
		this.template=template;
	}
	
	@Override
	public void createEmployee(Employee emp) {
		template.save(emp);
		
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		ArrayList<Employee> allEmployee= new ArrayList<Employee>();
		allEmployee=(ArrayList<Employee>) template.loadAll(Employee.class);
		return allEmployee;
	}

	@Override
	public Employee getEmployeeById(int Id) {
		Employee employee=template.get(Employee.class, Id);
		return employee;
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		template.update(emp);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		template.delete(emp);
		
	}


}
