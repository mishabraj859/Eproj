package com.niit.infatuation;



import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.infatuation.dao.CategoryDao;
import com.niit.infatuation.daoimpl.CategoryDaoImpl;
import com.niit.infatuation.model.Category;

public class CategoryTest {
	public static void main(String x[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		System.out.println("My Connection is Right");
		CategoryDao categoryDao=(CategoryDao) context.getBean("categoryDao");
		Category category=(Category) context.getBean("category");
	
		category.setCname("womenz wear");
		if(categoryDao.saveorupdate(category)==true)
		{
			System.out.println("saved");
		}
		else
		{
			
			System.out.println("sorry");
		}
		
		List<Category> list= categoryDao.list();
		for(Category c:list){
			System.out.println(c.getCid());
			System.out.println(c.getCname());
		}
//		
//		if(categoryDao.delete("cat123")== true)
//		{
//			System.out.println("delete is successful");
//		}
//		else
//		{
//			System.out.println("sorry");
//		}
		
		
		category=categoryDao.get("cat123");
        if(category==null)
        {
        	System.out.println("item not fount");
        }
        else
        {
        	System.out.println(category.getCid());
			System.out.println(category.getCname());
        }
        	

	}
	
}
