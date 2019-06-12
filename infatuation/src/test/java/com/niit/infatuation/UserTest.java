
package com.niit.infatuation;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.infatuation.dao.UserDao;
import com.niit.infatuation.model.User;

public class UserTest {
	public static void main(String x[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
	System.out.println(1233);
		System.out.println("My Connection is Right");
		UserDao userDao=(UserDao) context.getBean("userDao");
		User user=(User) context.getBean("user");
		user.setUid("use333");
		user.setUname("ashwini");
		user.setUaddress("#5 8th cross jainagar");
		user.setUcno("8745126974");
		user.setUmail("ashuse@gmail.com");
		user.setUpwd("595906ash");
				
//		if(userDao.saveorupdate(user)==true)
//		{
//			System.out.println("saved");
//		}
//		else
//		{
//			
//			System.out.println("sorry");
//		}
//		
//		List<User> list= userDao.list();
//		for(User u:list){
//			System.out.println(u.getUid());
//			System.out.println(u.getUname());
//			System.out.println(u.getUpwd());
//			System.out.println(u.getUaddress());
//			System.out.println(u.getUcno());
//			System.out.println(u.getUmail());
//		}
//		
//		if(userDao.delete("use333")== true)
//		{
//			System.out.println("delete is successful");
//		}
//		else
//		{
//			System.out.println("sorry");
//		}
		
		
//		user=userDao.get("use333");
//        if(user==null)
//        {
//        	System.out.println("item not fount");
//        }
//        else
//        {
//        	System.out.println(user.getUid());
//			System.out.println(user.getUname());
//			System.out.println(user.getUpwd());
//			System.out.println(user.getUaddress());
//			System.out.println(user.getUcno());
//			System.out.println(user.getUmail());
//        }
        
//        user=userDao.isvalidate("ashwini", "595906ash");
//        		{
//        	        if(user==null)
//        	        {
//        	        	System.out.println("user do not exsist");
//        	        }
//        	        else 
//        	        {
//        	        	System.out.println(user.getUid());
//        				System.out.println(user.getUname());
//        				System.out.println(user.getUpwd());
//        				System.out.println(user.getUaddress());
//        				System.out.println(user.getUcno());
//        				System.out.println(user.getUmail());
//        	        }
//        		}
	}
}

