package com.niit.infatuationfe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.infatuation.dao.CartDao;
import com.niit.infatuation.dao.CartItemDao;
import com.niit.infatuation.dao.ProductDao;
import com.niit.infatuation.dao.UserDao;
import com.niit.infatuation.model.Cart;
import com.niit.infatuation.model.CartItem;
import com.niit.infatuation.model.Product;
import com.niit.infatuation.model.User;

@Controller
public class CartController {
	@Autowired
	Cart cart;
	@Autowired
	CartDao cartDao;
	@Autowired
	CartItem cartItem;
	@Autowired
	CartItemDao cartItemDao;
	@Autowired
	User user;
	@Autowired
	UserDao userDao;
	@Autowired
	Product product;
	@Autowired
	ProductDao productDao;
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/addToCart/{pro_ID}")
	public ModelAndView addToCart(@PathVariable("pro_ID") String pro_ID)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(!(authentication instanceof AnonymousAuthenticationToken))
		{
			String currUserName = authentication.getName();
			User u = userDao.getUserEmail(currUserName);
			if(user==null)
			{
				return new ModelAndView("redirect:/");
			}
			else
			{
				cart=u.getCart();
				Product p = productDao.get(pro_ID);
				CartItem cartItems = new CartItem();
				cartItems.setCart(cart);
				cartItems.setProduct(p);
				cartItems.setPrice(p.getPcost());
				cartItemDao.Save(cartItems);
				cart.setGrandtotal(cart.getGrandtotal() +p.getPcost());
				cart.setTotalItems(cart.getTotalItems()+ 1);
				cartDao.saveupdate(cart);
				session.setAttribute("items",cart.getTotalItems());
				session.setAttribute("gTotal", cart.getGrandtotal());
				return new ModelAndView("redirect:/viewpro");
			}
		}
		else
		{
			return new ModelAndView("redirect:/");
		}
	}
	
	@RequestMapping(value="/like")
	public ModelAndView viewCart(HttpSession session)
	{
		System.out.println(123465789);
		ModelAndView obj = new ModelAndView("like");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(!(authentication instanceof AnonymousAuthenticationToken))
		{
			System.out.println(123465789);
			String currUserName = authentication.getName();
			User u = userDao.getUserEmail(currUserName);
			Cart c = u.getCart();
			List<CartItem> cartItems = cartItemDao.getlist(c.getCartId());
			if(cartItems==null || cartItems.isEmpty())
			{
				session.setAttribute("items", 0);
				obj.addObject("gTotal", 0.0);
				obj.addObject("msg", "no items added in the cart");
				return obj;
			}
			else
			{
				obj.addObject("allCartItems", cartItems);
				obj.addObject("gTotal", c.getGrandtotal());
				session.setAttribute("items", c.getTotalItems());
				return obj;
			}
		}
		else
		{
			return new ModelAndView("redirect:/");
		}
			
	}
	
	@RequestMapping(value="/removeItem/{cartItems_ID}")
	public ModelAndView removeItem(@PathVariable("cartItems_ID") String cartItems_ID)
	{
		ModelAndView obj = new ModelAndView("redirect:/like");
		cartItem= cartItemDao.get(cartItems_ID);
		Cart c = cartItem.getCart();
		c.setGrandtotal(c.getGrandtotal() - cartItem.getPrice());
		c.setTotalItems(c.getTotalItems()- 1);
		cartDao.saveupdate(c);
		cartItemDao.delete(cartItem.getCartItem_Id());
		return obj;
	}
	
	@RequestMapping(value="/removeAllItems")
	public ModelAndView removeAllItems(HttpSession session)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(!(authentication instanceof AnonymousAuthenticationToken))
		{
		ModelAndView obj = new ModelAndView("redirect:/like");
		String currUserName = authentication.getName();
		User u = userDao.getUserEmail(currUserName);
		Cart c = cartDao.get(u.getCart().getCartId());
		List<CartItem> cartItems = cartItemDao.getlist(u.getCart().getCartId());
		for(CartItem g:cartItems)
		{
			cartItemDao.delete(g.getCartItem_Id());
		}
		c.setGrandtotal(0.0);
		c.setTotalItems(0);
		cartDao.saveupdate(c);
		return obj;
	   }
		else
		{
			return new ModelAndView("redirect:/");
		}
}

}
