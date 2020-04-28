package com.wipro.topgear.assignment1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentOneController {
	
	
	@RequestMapping("/bankname")
	public String displayBankName() {
		return "HDFC BANK";
	}
	
	@RequestMapping("/bankaddress")
	public String displayBankAddress(){
		return "SholinganallurChennai";
	}

}
