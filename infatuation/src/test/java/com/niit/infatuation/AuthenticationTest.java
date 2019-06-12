package com.niit.infatuation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AuthenticationTest {
	public static void main(String a[])
	{
		System.out.println(123);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
	}

}
