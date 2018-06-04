package com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	@RequestMapping("/welcome")
	public String First_Page()
	{   System.out.println("-------this is home----------");
		return "welcome";}
	
	  @RequestMapping("/next")
	  public String next_page()
	  {
		return "next";}
	  

}
