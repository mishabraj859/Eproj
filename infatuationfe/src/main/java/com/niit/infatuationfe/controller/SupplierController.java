package com.niit.infatuationfe.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.infatuation.dao.ProductDao;
import com.niit.infatuation.dao.SupplierDao;
import com.niit.infatuation.model.Product;
import com.niit.infatuation.model.Supplier;



@Controller
@Transactional
public class SupplierController 
{
	@Autowired 
	Supplier supplier;
	@Autowired 
	SupplierDao supplierDao;
	@Autowired
	Product product;
	@Autowired
	ProductDao productDao;
	
	@RequestMapping(value= "/addsup",method=RequestMethod.POST)
	public ModelAndView addsup(@ModelAttribute("supplier")Supplier su)
	{
		ModelAndView obj=new ModelAndView("redirect:/supplier");
		if(supplierDao.saveorupdate(su)==true)
		{
			
			obj.addObject("msg", "Supplier is added successfuly");
		}
		else
		{
			obj.addObject("msg", "Supplier adding FAILLED!!");
		}
	      return obj; 
	}
	
	@RequestMapping("/edditsupplier/{id}")
	public ModelAndView edditcategory(@PathVariable("id")String id)
	{
		System.out.println(123);
		List<Supplier> supplier=supplierDao.list();
		ModelAndView obj = new ModelAndView("supplier");
		Supplier s=supplierDao.get(id);
		obj.addObject("supplier",s);
		obj.addObject("sup",supplier);
		return obj;
		
	}
	@RequestMapping("/deletesupplier/{id}")
	public ModelAndView deletesupplier(@PathVariable("id")String id)
	{
	    List<Product> pro=productDao.list();
	     for(Product p:pro)
	     {
	    	 if(p.getSupplier().getSid().equals(id))
	    	 {
	    		 productDao.delete2(p);
	    	 }
	     }
	     supplierDao.delete2(supplierDao.get(id));
		ModelAndView obj = new ModelAndView("redirect:/supplier");		
		return obj;
		
	}

}
