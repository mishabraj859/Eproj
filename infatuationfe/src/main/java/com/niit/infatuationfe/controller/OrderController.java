package com.niit.infatuationfe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.infactuationfe.Otp.Otpgenerator;
import com.niit.infatuation.dao.BillingAddrDao;
import com.niit.infatuation.dao.CardDao;
import com.niit.infatuation.dao.CartDao;
import com.niit.infatuation.dao.CartItemDao;
import com.niit.infatuation.dao.OrderDao;
import com.niit.infatuation.dao.OrderItemDao;
import com.niit.infatuation.dao.PayDao;
import com.niit.infatuation.dao.ProductDao;
import com.niit.infatuation.dao.ShippingAddrDao;
import com.niit.infatuation.dao.UserDao;
import com.niit.infatuation.model.BillingAddr;
import com.niit.infatuation.model.Card;
import com.niit.infatuation.model.Cart;
import com.niit.infatuation.model.CartItem;
import com.niit.infatuation.model.Order;
import com.niit.infatuation.model.OrderItem;
import com.niit.infatuation.model.Pay;
import com.niit.infatuation.model.Product;
import com.niit.infatuation.model.ShippingAddr;
import com.niit.infatuation.model.User;
import com.sun.org.apache.xpath.internal.operations.Or;
@Controller
public class OrderController {
	@Autowired
	Cart cart;
	
	@Autowired
	CartDao cartDao;
	
	@Autowired
	CartItem cartItem;

	@Autowired
	CartItemDao cartItemDao;

	@Autowired
	Card card;
	
	@Autowired
	CardDao cardDao;
	
	@Autowired
	BillingAddr billingAddress ;
	
	@Autowired
	BillingAddrDao billingAddressDao;
	
	@Autowired
	ShippingAddr shippingAddress;
	
	@Autowired
	ShippingAddrDao shippingAddressDao;
	
	@Autowired
	Pay pay;
	
	@Autowired
	PayDao payDao;
	
	@Autowired
	Order order;
	
	@Autowired
	OrderDao orderDao;
	
	@Autowired
	OrderItem orderItem;
	
	@Autowired
	OrderItemDao orderItemsDao;
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	User user;
	
	@Autowired
	UserDao userDao;
	
	String o;
	@Autowired
   List<CartItem> CartItems;

	@Autowired
	private JavaMailSender mailSender;
	
	@RequestMapping("/buyall")
	public String buyall(Model model)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			String currusername = authentication.getName();
			user = userDao.getUserEmail(currusername);
			cart = user.getCart();
			product=null;
			CartItems = cartItemDao.getlist(cart.getCartId());
			if(CartItems==null || CartItems.isEmpty())
			{
				return "redirect:/like";
			}
			else
			{
				List<ShippingAddr> shippingAddress = shippingAddressDao.getaddbyuser(user.getUid());
				model.addAttribute("user",user);
				model.addAttribute("shippingAddress", shippingAddress);
				model.addAttribute("shippingAdd", new ShippingAddr());
			}
			return "BSP";
		}
		else {
			return "redirect:/";
		}
		
	}
	
	@RequestMapping("/order/{id}/{cid}")
	public String order(@PathVariable("id") String id,@PathVariable("cid") String id2, Model model) 
	{
		System.out.println(123456789);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			String currusername = authentication.getName();
			user = userDao.getUserEmail(currusername);
			cart = user.getCart();
			cartItem = cartItemDao.get(id2);
			CartItems=null;
			product = productDao.get(id);
			List<ShippingAddr> shippingAddress = shippingAddressDao.getaddbyuser(user.getUid());
			model.addAttribute("user",user);
			model.addAttribute("shippingAddress", shippingAddress);
			model.addAttribute("shippingAdd", new ShippingAddr());
			model.addAttribute("pro", product);
			return "BSP";
		} else {
			return "redirect:/";
		}

	}
	@RequestMapping("/orderConform")
	public String payment(@ModelAttribute("shippingAdd") ShippingAddr sh, Model model) {
	sh.setUser(user);
	shippingAddress=sh;
	billingAddress=user.getBilling();
	model.addAttribute("user",user);
	model.addAttribute("shippingAdd", shippingAddress);
	model.addAttribute("pro", product);
	model.addAttribute("cartItems", CartItems);
	model.addAttribute("cart", cart);
	return "ordercon";
	}
	@RequestMapping("/pay")
	public String pay(Model model) {
		List<Card> cards = cardDao.getcardbyuser(user.getUid());
		model.addAttribute("cards", cards);
		model.addAttribute("card", new Card());
		return "payment";
	}
	@RequestMapping("/paymet")
	public String paymet(@ModelAttribute("card") Card car,@RequestParam("otp") String otp,Model model) {
		int a;
		if(otp==null)
			a=2;
		else 
			a=1;
		switch (a) {
		case 1:
			if(o.equals(otp))
		     {
				pay.setPay_MAY("COD");
				  pay.setPay_STATUS("NO");
				  break;	
		     }
			else{
				return "redirect:/pay";
				
			}
		case 2:
			
			pay.setPay_MAY("Card");
			pay.setPay_STATUS("yes");
//			payDao.saveupdate(pay);
//			cardDao.saveupdate(car);
			break;
		}

		return "redirect:/orderconformation";
	}
	
	@RequestMapping("/orderconformation")
	public String orderconformation(HttpSession session) {
		order.setBillingAddress(billingAddress);
		order.setShippingAddress(shippingAddress);
		order.setPay(pay);
		order.setUser(user);
		if (CartItems == null || CartItems.isEmpty()) 
			
		{
			order.setGrand_TOTAL(product.getPcost());
	    	orderDao.Saveorupdate(order);
			orderItem.setOrder(order);
			orderItem.setPro_ID(product.getPid());
			orderItemsDao.Saveorupdate(orderItem);
			cart.setGrandtotal(cart.getGrandtotal()- cartItem.getPrice());		
			cart.setTotalItems(cart.getTotalItems()-1);
			session.setAttribute("items", cart.getTotalItems());
            cartDao.saveupdate(cart);
			cartItemDao.delete(cartItem.getCartItem_Id());
			
		}
		else
		{
			
			order.setGrand_TOTAL(cart.getGrandtotal());
			orderDao.Saveorupdate(order);
			for(CartItem c:CartItems)
			{
				OrderItem orderItems=new OrderItem();
				orderItems.setOrder(order);
				orderItems.setPro_ID(c.getProduct().getPid());
				orderItemsDao.Saveorupdate(orderItems);
				cartItemDao.delete(c.getCartItem_Id());
			}
			session.setAttribute("orderId",order.getOrder_ID());
			session.setAttribute("orderprice",order.getGrand_TOTAL());
			cart.setGrandtotal(0.0);
			cart.setTotalItems(0);
			session.setAttribute("items", cart.getTotalItems());
			cartDao.saveupdate(cart);
		}
		return "redirect:/orderconf";
	}
	@RequestMapping("/orderconf")
	public String  orderconf(Model model,HttpSession session)
	{
		
//		List<Product> p=null;
//		List<OrderItem> list=orderItemsDao.getOrderItemsbyOrder(order.getOrder_ID()); 
//		for(OrderItem o:list)
//		{
//			p.add(productDao.get(o.getPro_ID()));
//			
//		}
		
//		model.addAttribute("p", p);
		
		
//		
//		model.addAttribute("order", op);
//		cartItem=null;
//		product=null;
//		CartItems=null;
//		order=new Order() ;
//		orderItem=new OrderItem();
	
		return "orderconformationpage";
	}
	
	
@RequestMapping("/SendMail")
public void SendMail()
{
	Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
	if(!(authentication instanceof AnonymousAuthenticationToken))
	{
		String currusername=authentication.getName();
		user=userDao.getUserEmail(currusername);
		Otpgenerator otp=new Otpgenerator();
		 o=otp.Otpga();
		String recipientAddress = user.getUmail();
		String subject = "OTP";
		String message = "Your One time password is  "+o+" ";
		
		System.out.println("To:"+ recipientAddress);
		System.out.println("Subject:"+ subject);
		System.out.println("Message:"+ message);
		
		SimpleMailMessage email= new SimpleMailMessage();
		email.setTo(recipientAddress);
		email.setSubject(subject);
		email.setText(message);
		mailSender.send(email);
		
	}
}

}
