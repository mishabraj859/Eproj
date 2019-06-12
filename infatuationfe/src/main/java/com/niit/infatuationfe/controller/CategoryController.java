package com.niit.infatuationfe.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.infatuation.dao.CategoryDao;
import com.niit.infatuation.dao.ProductDao;

import com.niit.infatuation.model.Category;
import com.niit.infatuation.model.Product;


@Controller
@Transactional
public class CategoryController 
{
	@Autowired 
	Category category;
	@Autowired 
	CategoryDao categoryDao;
	@Autowired 
	Product product;
	@Autowired 
	ProductDao productDao;

	@RequestMapping("/category")
	public ModelAndView category()
	{
		 ModelAndView obj =new ModelAndView("category");
		obj.addObject("category", new Category());
		obj.addObject("msg", "null");
		obj.addObject("msg2", "null");
		List<Category> list= categoryDao.list();
		obj.addObject("listc", list);
		return obj;
	}
	@RequestMapping(value= "/addcat",method=RequestMethod.POST)
	public ModelAndView addcat(@ModelAttribute("category")Category ca)
	{
		
		ModelAndView obj=new ModelAndView("redirect:"+"/category");
		if(categoryDao.saveorupdate(ca)==true)
		{
			obj.addObject("msg", "Category is add successfuly");

		}
		else
		{
			obj.addObject("msg2", "Category Adding FAILLED!!");
		}
	      return obj; 
	}
	@RequestMapping("/edditcategory/{id}")
	public ModelAndView edditcategory(@PathVariable("id")String id)
	{
		System.out.println(123);
		List<Category> list= categoryDao.list();
		

		ModelAndView obj = new ModelAndView("category");
		 Category ca=categoryDao.get(id);
		 obj.addObject("listc", list);
		obj.addObject("category",ca);
		return obj;
		
	}
	@RequestMapping("/deletecategory/{id}")
	public ModelAndView deletecategory(@PathVariable("id")String id)
	{
		List <Product> pro=categoryDao.get(id).getProduct();
	       if(pro==null || pro.isEmpty())
	    	   categoryDao.delete(id);
	       else
	       {
	    	for(Product p: pro)
	    	{
	    	   productDao.delete2(p);	
	    	}
	    	categoryDao.delete(id);
	       }
		  
		
		ModelAndView obj = new ModelAndView("redirect:/category");
		return obj;
		
	}
		
	
	

}
