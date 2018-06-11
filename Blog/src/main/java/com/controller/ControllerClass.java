package com.controller;





import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.BlogDto;
import com.dto.UserDto;
import com.model.Blog;
import com.model.User;
import com.repository.BlogRepository;
import com.repository.UserRepository;


import com.service.UserServiceImpl;


@Controller
public class ControllerClass {
	

	@Autowired
	UserServiceImpl usi;
	

	@Autowired
	BlogRepository br; 
	
	@Autowired
	UserRepository ur;
	
	
	
	@GetMapping("getForm")
	    public String getForm() {
		  System.out.println("This is welcome");
	        return "welcome";
	    }
	    
	    @PostMapping("/getOption")                     // it only support port method
	    public String getOption(@RequestParam("User") String User,
	                                                          ModelMap modelMap) {
	        // write your code to save details
	       /* modelMap.put("User", User);*/
	               return "next";           // welcome is view name. It will call welcome.jsp
	    }
		
	    @RequestMapping("/AuthorLogin")
		public String Login()
		{   System.out.println("-------this is Author Login----------");
			return "AuthorLogin";}
	    
	    @RequestMapping("/ShowBlog")
	    public String showblog()
	    {String result = "";
	    for (BlogDto b: usi.fetchAllBlog())
	    { result += b.getBlog_id()+b.getBlog()+b.getType() + "</br>";}
		return result;
	    }
	    
	    @RequestMapping("/ShowUser")
	    @ResponseBody
	    public String showuser()
	    {String result = "";
	    for (UserDto u: usi.fetchAllUser())
	    { result += u.getUser_id()+u.getUsername()+u.getPassword() + "</br>";}
		return result;
	    
			}
	    
	    @RequestMapping("/RegisterAuthor")
	  	public String Registration()
	  	{   System.out.println("-------this is Registration ----------");
	  		return "RegisterAuthor";}


	    @GetMapping("/create")
	    public String create(@RequestParam String username, @RequestParam String password, @RequestParam String Email)
	    {User u=new User(username,password,Email);
	    usi.Register(u);
	    return "UserSaved";}
	    
	    @GetMapping("/Validation")
	    public String log(@RequestParam String username, @RequestParam String password, HttpServletRequest request)
	    {if((usi.findByUsernameAndPassword(username, password)!=null))
	    {request.setAttribute("usern", username);
	    	return "AuthorDashboard";}
		return "AuthorLogin";}
	    
	    
	    
	    
}
