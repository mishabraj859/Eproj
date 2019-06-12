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

import com.niit.infatuation.dao.CartDao;
import com.niit.infatuation.dao.CartItemDao;
import com.niit.infatuation.dao.CategoryDao;
import com.niit.infatuation.dao.ProductDao;
import com.niit.infatuation.model.Cart;
import com.niit.infatuation.model.CartItem;
import com.niit.infatuation.model.Category;
import com.niit.infatuation.model.Product;
import com.niit.infatuation.model.Supplier;
import com.niit.infatuationfe.FileInput.FileInput;
import com.niit.infatuation.dao.SupplierDao;
@Controller
@Transactional
public class ProductController 
{
	@Autowired 
	Product product;
	@Autowired 
	ProductDao productDao;
	@Autowired
	Category category;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	Supplier supplier;
	
	@Autowired
	SupplierDao supplierDao;
	@Autowired
	Cart cart;
	@Autowired
	CartDao cartDao;
	@Autowired
	CartItem CartItem;
	@Autowired
	CartItemDao  cartItemDao; 
	String path="C:\\Users\\Abhijit\\eclipse-workspace\\infatuationfe\\src\\main\\webapp\\resources\\pics\\";
	
	
	
	@RequestMapping("/product")
	public ModelAndView product()
 	{
		ModelAndView obj =new ModelAndView("product");
		List<Product> products=productDao.list();
		List<Category> categorys=categoryDao.list();
		List<Supplier> Supplier=supplierDao.list();
		obj.addObject("product", new Product());
		obj.addObject("pro",products);
		obj.addObject("cat", categorys);
		obj.addObject("Sup", Supplier);
		return obj;

		}
	@RequestMapping(value= "/addpro",method=RequestMethod.POST)
	public ModelAndView addpro(@ModelAttribute("product")Product pr)
	{
		ModelAndView obj=new ModelAndView("redirect:/product");
		if(productDao.saveorupdate(pr)==true)
		{
			
			FileInput.upload(path, pr.getPimg(),pr.getPid()+".jpg");
			obj.addObject("msg", "Product is added successfuly");
	
		}
		else
		{
			obj.addObject("msg", "Product adding FAILED!!");
		}
	      return obj; 
	}	
	@RequestMapping("/editproduct/{id}")
	public ModelAndView editproduct(@PathVariable("id")String id)
	{
		List<Category> categorys=categoryDao.list();
		List<Supplier> Supplier=supplierDao.list();
		List<Product> product=productDao.list();
		ModelAndView obj = new ModelAndView("product");
	    Product	prod=productDao.get(id);
	    obj.addObject("product",prod);
	    obj.addObject("pro",product);
		obj.addObject("cat", categorys);
		obj.addObject("Sup", Supplier);
		
		return obj;
	}
	
	@RequestMapping("/deleteproduct/{id}")
	public ModelAndView deleteproduct(@PathVariable("id")String id)
	{
		
		System.out.println(123);
		ModelAndView obj = new ModelAndView("redirect:/product");
		if(productDao.delete(id))
		{
			obj.addObject("msg","product is deleted successfuly");		
		}
		else
		{
			obj.addObject("msg","product is not  deleted");
		}
		
		return obj;
		
	}
	@RequestMapping("/viewall/{id}")
	public ModelAndView viewProduct(@PathVariable("id")String id)
	{
		ModelAndView obj=new ModelAndView("protemp");
		product=productDao.get(id);
		obj.addObject("product", product);
		return obj;
		
		
	}
	//@RequestMapping("/allproduct/productsBy")
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping("/editproduct/{id}")
//	public ModelAndView editproduct(@PathVariable("id")String id)
//	{
//		
//		List<Product> product=productDao.list();
//		ModelAndView obj = new ModelAndView("productform");
//	    Product	prod=productDao.get(id);
//	    obj.addObject("product",prod);
//	    obj.addObject("pro",product);
//	    List<Category> category=categoryDao.list();
//		List<Supplier> Supplier=supplierDao.list();
//		obj.addObject("categorise", category);
//		obj.addObject("Suppliers", Supplier);
//		
//		return obj;
//	}
//	
//	@RequestMapping("/deleteproduct/{id}")
//	public ModelAndView deleteproduct(@PathVariable("id")String id)
//	{
//		
//		
//		ModelAndView obj = new ModelAndView("redirect:/product");
//		
//		return obj;
//		
//	}
//	
//	
//	public void deletepro(String id)
//	{
//		Cart c;
//		if(cartItemDao.getlistbyproId(id)==null)
//		{
//			productDao.delete(id);	
//		}
//		else
//		{
//			List<CartItem> cartItems=cartItemDao.getlistbyproId(id);
//			for(CartItem ci:cartItems)
//			{
//				c=ci.getCart();
//				double g=c.getGrandtotal()-ci.getPrice();
//				c.setGrandtotal(g);
//				c.setTotalItems(c.getTotalItems()-1);
//				cartDao.saveupdate(c);
//				cartItemDao.delete(ci.getCartItem_Id());
//			}
//			productDao.delete(id);
//		}
//		
//	}
	
	

}
