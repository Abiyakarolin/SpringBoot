package com.wipro.assignment5;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	static int id = 1;
	public Map<Integer,Employee> employees = new HashMap<Integer,Employee>();
	public Employee employee = new Employee("Abiya","abiya@gmail.com","Chennai");
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public String add(@RequestBody Employee employee) {
		employees.put(id,employee);
		id++;
		return "User Added";
		
	}
	
	
	@RequestMapping(value="/displayAll",produces = {"application/json"})
	public Map<Integer,Employee> displayAll(){
		return employees;
	}
	
	@RequestMapping(value="/display/{id}",produces= {"application/json"})
	public Employee display(@PathVariable(name="id") int id) {
		
		return employees.get(id);
		
	}
	

	@RequestMapping(value="/edit/{id}",method = RequestMethod.PUT)
	public String edit(@PathVariable(name="id") int id, @RequestBody Employee employee) {
		
		employees.put(id,employee);
		
		return "User edited Sucessfully";
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
	public String delete(@PathVariable(name="id") int id) {
		
		employees.remove(id);
		
		return "User deleted Sucessfully";
	}

}
