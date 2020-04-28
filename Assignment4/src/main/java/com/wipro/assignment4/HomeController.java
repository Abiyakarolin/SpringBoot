package com.wipro.assignment4;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(Employee employee){
		
		employeeRepo.save(employee);
		return "user added";
	}
	
	@RequestMapping(value="/displayAll",produces = {"application/json"})
	@ResponseBody
	public List<Employee> disaplyAll() {
		
		return (List<Employee>) employeeRepo.findAll();
		
	}
	
	@RequestMapping(value="/display/{id}",produces = {"application/json"})
	@ResponseBody
	public Optional<Employee> disaplybyId(@PathVariable(value="id") int id) {
		
		return employeeRepo.findById(id);
		
	}

}
