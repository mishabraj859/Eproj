package com.niit.infatuation;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.infatuation.dao.ProductDao;
import com.niit.infatuation.model.Product;

public class ProductTest {
	public static void main(String x[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		System.out.println("My Connection is Right");
		ProductDao productDao=(ProductDao) context.getBean("productDao");
		Product product=(Product) context.getBean("product");
//		product.setPid("pro333");
		product.setPname("crop top");
		product.setPcost(3000);
		product.setPdesc("synthetic material, dry wash,pure lakiru");
		product.setPquan(10);
//		product.setSid("sup333");
//		product.setCid("cat123");
		//product.setImage("C:\Users\5559\Desktop\pics\aad.jpg");
		
		if(productDao.saveorupdate(product)==true)
		{
			System.out.println("saved");
		}
		else
		{
			
			System.out.println("sorry");
		}
		
		List<Product> list= productDao.list();
		for(Product p:list){
//			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(p.getPcost());
			System.out.println(p.getPquan());
//			System.out.println(p.getSid());
//			System.out.println(p.getCid());
		}
//		
//		if(productDao.delete("pro333")== true)
//		{
//			System.out.println("delete is successful");
//		}
//		else
//		{
//			System.out.println("sorry");
//		}
		
		
		product=productDao.get("pro333");
        if(product==null)
        {
        	System.out.println("item not fount");
        }
        else
        {
        	System.out.println(product.getPid());
			System.out.println(product.getPname());
//			System.out.println(product.getCid());
//			System.out.println(product.getSid());
			System.out.println(product.getPcost());
			System.out.println(product.getPdesc());
			System.out.println(product.getPquan());
        }
        	
	}
}
