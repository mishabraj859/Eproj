package com.niit.infatuationfe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.infatuation.dao.UserDao;
import com.niit.infatuation.model.User;

@Controller
public class LoginController {

	@Autowired
	UserDao userDao;
	@Autowired
	User user;
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false)String error,@RequestParam(value="logout",required=false)String logout,Model model)
	{
		if(error!=null)
			model.addAttribute("error", "invalid user name or password");
		if(logout!=null)
			model.addAttribute("logout", "login success");
		return "redirect:/";
	}
	
	@RequestMapping(value="/j_spring_security_check")
	public String processRegistration(@RequestParam("j_username")String E,@RequestParam("j_password")String P, Model model, HttpSession session)
	{
		User u = (User)userDao.isvalidate(E,P);
		
		if(u==null)
		{
			model.addAttribute("msg","Invalid username and password");
			return "redirect:/";
		}
		
		else
		{
			session.setAttribute("user",u);
			session.setAttribute("name", u.getUname());
			return "redirect:/";
		}
	}
	
	@RequestMapping(value="/j_spring_security_logout")
	public String logout(HttpServletRequest request, HttpSession session, Model model)
	{
		session.invalidate();
		session=request.getSession(true);
		model.addAttribute("logout","logout successful");
		return "redirect:/";
	}
}



