package com.niit.infatuation;

	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.infatuation.dao.CartDao;
import com.niit.infatuation.dao.CartItemDao;
import com.niit.infatuation.dao.ProductDao;
import com.niit.infatuation.dao.UserDao;
import com.niit.infatuation.model.Cart;
import com.niit.infatuation.model.CartItem;
import com.niit.infatuation.model.Product;
import com.niit.infatuation.model.User;
	public class CartItemTest {
		public static void main(String a[])
		{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		User user=(User)context.getBean("user");
		UserDao userDao=(UserDao)context.getBean("userDao");
		 
		Product p=(Product)context.getBean("product");  
		ProductDao productDao=(ProductDao)context.getBean("productDao"); 
		
		Cart cart=(Cart)context.getBean("cart"); 
		CartDao cartDao=(CartDao)context.getBean("cartDao");
		
		CartItem cartItem=(CartItem)context.getBean("cartItem");
		CartItemDao cartItemDao=(CartItemDao)context.getBean("cartItemDao");
		
		User u=userDao.get("USERA4DCE2");
		
		Product pro=(Product)productDao.get("pro541");
		
		cartItem.setCart(u.getCart());
		cartItem.setProduct(pro);
		cartItem.setPrice(pro.getPcost());
		
		if(cartItemDao.Save(cartItem)==true)
		{
			System.out.println("Cart is added");
		}
		if(cartItemDao.delete("cItem58CB15")==true)
		{
			System.out.println("Cart is deleted");
		}
		else
		{
			System.out.println("Cart is not deleted");
		}

		cart=u.getCart();
		cart.setGrandtotal(cart.getGrandtotal()+pro.getPcost());
		cart.setTotalItems(cart.getTotalItems()+1);
		cartDao.saveupdate(cart);
	   }
	}


