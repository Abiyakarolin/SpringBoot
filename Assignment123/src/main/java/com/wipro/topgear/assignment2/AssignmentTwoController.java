package com.wipro.topgear.assignment2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AssignmentTwoController {
	
	@RequestMapping("/branchnames")
	public String display() {
		return "bankbranches";
	}
	
	@RequestMapping("/bankservices")
	public String displayservice() {
		return "bankservices";
	}
	
	@RequestMapping("/{health}")
	@ResponseBody
	public String health(@PathVariable(name="health") String health) {
		
		return "Application is working Fine";
	}

}
