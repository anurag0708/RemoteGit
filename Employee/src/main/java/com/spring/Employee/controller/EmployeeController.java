package com.spring.Employee.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.Employee.Repository.EmployeeDao;
import com.spring.Employee.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("dashboard");
	}
	
	@RequestMapping(value="/employeeform" ,method=RequestMethod.GET)
	public ModelAndView displayform()
	{
		return new ModelAndView("employeeform","empform",new Employee());
	}
	
	@RequestMapping(value="/saveemployee",method=RequestMethod.POST)
	public ModelAndView createEmployee(@ModelAttribute("empform") Employee emp)
	{
		employeeDao.createEmployee(emp);
		return new ModelAndView("redirect:/getAllEmployee");
	}
	
	@RequestMapping(value="/getAllEmployee" ,method=RequestMethod.GET)
	public ModelAndView getAllEmployee() 
	{
		ArrayList<Employee> empList=employeeDao.getAllEmployee();
		
		return new ModelAndView("allemployee","empList",empList);
		
	}
	
	@RequestMapping(value="/edit/{employeeId}" ,method=RequestMethod.GET)
	public ModelAndView editEmp(@PathVariable("employeeId") int employeeId)
	{
		Employee employeeDeatils=employeeDao.getEmployeeById(employeeId);
		return new ModelAndView("editemployee","emp",employeeDeatils);
	}
	
	@RequestMapping(value={"/edit/update"},method=RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute("emp") Employee emp)
	{
		employeeDao.updateEmployee(emp);
		return new ModelAndView("redirect:/getAllEmployee");
	}
	
	@RequestMapping(value="/delete/{employeeId}",method=RequestMethod.GET)
	public ModelAndView deleteEmp(@PathVariable int employeeId)
	{
		Employee emp=employeeDao.getEmployeeById(employeeId);
		employeeDao.deleteEmployee(emp);
		return new ModelAndView("redirect:/getAllEmployee");
		
	}
	
}
