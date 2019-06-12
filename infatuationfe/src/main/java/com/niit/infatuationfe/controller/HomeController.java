package com.niit.infatuationfe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.infatuation.dao.CategoryDao;
import com.niit.infatuation.dao.ProductDao;
import com.niit.infatuation.dao.SupplierDao;
import com.niit.infatuation.dao.UserDao;
import com.niit.infatuation.model.Category;
import com.niit.infatuation.model.Product;
import com.niit.infatuation.model.Supplier;
import com.niit.infatuation.model.User;

@Controller
public class HomeController {
	@Autowired
	Category category;
	@Autowired
	Supplier supplier;
	@Autowired
	User user;
	@Autowired
	CategoryDao categoryDao;  
	@Autowired
	UserDao userDao; 
	@Autowired
	SupplierDao supplierDao; 
	
	@Autowired
	Product product;
	@Autowired
	ProductDao productDao;

	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("/viewpro")
	public String viewpro(Model model)
	{
		List<Product> products=productDao.list();
		model.addAttribute("products",products);
		return "viewpro";
	}
	@RequestMapping("/viewmen")
	public String viewmen(Model model)
	{
		List<Product> products=productDao.list();
		model.addAttribute("products",products);
		return "viewpro";
	}
	
	@RequestMapping("/index")
	public ModelAndView home()
	{
		return new ModelAndView("index");
	}
	
	
	@RequestMapping("/order")
	public ModelAndView order()
	{
		return new ModelAndView("order");
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		return new ModelAndView("about");
	}
	
	@RequestMapping("/protemp")
	public ModelAndView protemp()
	{
		return new ModelAndView("protemp");
	}
	
	@RequestMapping("/EditUser")
	public ModelAndView EditUser()
	{
		return new ModelAndView("EditUser");
	}
	
	@RequestMapping("/BSP")
	public ModelAndView BSP()
	{
		return new ModelAndView("BSP");
	}
	
	
	@RequestMapping("/contact")
	public ModelAndView contact()
	{
		return new ModelAndView("contact");
	}
	@RequestMapping("/user")
	public ModelAndView user()
	{
		 ModelAndView obj =new ModelAndView("user");
		obj.addObject("user", user);
		obj.addObject("msg", "null");
		obj.addObject("msg2", "null");
		List<User> list= userDao.list();
		obj.addObject("listu", list);
		return obj;
	}
	
	@RequestMapping("/supplier")
	public ModelAndView supplier()
	{
		ModelAndView obj =new ModelAndView("supplier");
		obj.addObject("supplier", supplier);
		obj.addObject("msg", "null");
		obj.addObject("msg2", "null");
		List<Supplier> list= supplierDao.list();
		obj.addObject("lists", list);
		return obj;
	}
	
	
}
