package com.niit.infatuation;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.infatuation.dao.SupplierDao;
import com.niit.infatuation.model.Supplier;

public class SupplierTest {
	public static void main(String x[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		System.out.println("My Connection is Right");
		SupplierDao supplierDao=(SupplierDao) context.getBean("supplierDao");
		Supplier supplier=(Supplier) context.getBean("supplier");
		supplier.setSid("sup333");
		supplier.setSname("abhijit");
		supplier.setSaddress("#345 2nd stage rajajinagar");
		supplier.setScno("8906004225");
		supplier.setSmail("abhijitmahanti@gmail.com");
				
		if(supplierDao.saveorupdate(supplier)==true)
		{
			System.out.println("saved");
		}
		else
		{
			
			System.out.println("sorry");
		}
		
		
		List<Supplier> list= supplierDao.list();
		for(Supplier s:list){
			System.out.println(s.getSid());
			System.out.println(s.getSname());
			System.out.println(s.getSaddress());
			System.out.println(s.getScno());
			System.out.println(s.getSmail());
		}
//		
//		if(supplierDao.delete("sup333")== true)
//		{
//			System.out.println("delete is successful");
//		}
//		else
//		{
//			System.out.println("sorry");
//		}
		
		
		supplier=supplierDao.get("sup333");
        if(supplier==null)
        {
        	System.out.println("item not fount");
        }
        else
        {
        	System.out.println(supplier.getSid());
			System.out.println(supplier.getSname());
			System.out.println(supplier.getSmail());
			System.out.println(supplier.getScno());
			System.out.println(supplier.getSaddress());
        }
	}
}

