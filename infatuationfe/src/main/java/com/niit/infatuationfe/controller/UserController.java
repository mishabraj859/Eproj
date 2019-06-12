package com.niit.infatuationfe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.infatuation.dao.BillingAddrDao;
import com.niit.infatuation.dao.UserDao;
import com.niit.infatuation.model.BillingAddr;
import com.niit.infatuation.model.Cart;
import com.niit.infatuation.model.User;

@Controller
@Transactional
public class UserController 
{
	@Autowired 
	User user;
	@Autowired 
	UserDao userDao;
	@Autowired
	HttpSession session;
	@Autowired
	HttpServletRequest request; 
	
	@Autowired
	BillingAddr billing;
	@Autowired
	BillingAddrDao billingDao;
	
	@RequestMapping(value= "/adduser",method=RequestMethod.POST)
	public ModelAndView adduser(@ModelAttribute("user")User user)
	{
//		System.out.println(1);
//		String s="/user";
		ModelAndView obj=new ModelAndView("user");
		Cart cart=new Cart();
		user.setCart(cart);
		
		if(userDao.saveorupdate(user)==true)
		{
			obj.addObject("msg", "user  added successfuly please login");
		}
		else
		{
			obj.addObject("msg2", "Sorry i am not being able to add user");
		}
	      return obj; 
	}
	
	
//	@RequestMapping(value= "/j_spring_security_check",method=RequestMethod.POST)
//	public ModelAndView signup(@RequestParam("j_username")String uname,@RequestParam("j_password")String upwd)
//	{
//		ModelAndView obj=new ModelAndView("index");
//		System.out.println(uname+" "+upwd);
//		User u=userDao.isvalidate(uname, upwd);
//		if(u!=null)
//		{
//			System.out.println(1);
//			session.setAttribute("user",u);
//			session.setAttribute("name",u.getUname());
//			session.setAttribute("id",u.getUid());
//			session.setAttribute("contactno",u.getUcno());
//			session.setAttribute("Emailid",u.getUmail());
//			return obj;
//		}
//		else
//		{
//			obj.addObject("msg", "login failed");
//	     return obj; 	
//		}
//	    
//	}
//	@RequestMapping(value= "/j_spring_security_logout",method=RequestMethod.POST)
//	public ModelAndView logout()
//	{
//		ModelAndView obj=new ModelAndView("index");
//		session.invalidate();
//		session=request.getSession(true); 
//		return obj; 
//	
//	    
//	}
//
}
