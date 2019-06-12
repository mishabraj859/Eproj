package com.niit.infatuation.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.infatuation.dao.AuthenticationDao;
import com.niit.infatuation.dao.BillingAddrDao;
import com.niit.infatuation.dao.CardDao;
import com.niit.infatuation.dao.CartDao;
import com.niit.infatuation.dao.CartItemDao;
import com.niit.infatuation.dao.CategoryDao;
import com.niit.infatuation.dao.OrderDao;
import com.niit.infatuation.dao.OrderItemDao;
import com.niit.infatuation.dao.PayDao;
import com.niit.infatuation.dao.ProductDao;
import com.niit.infatuation.dao.ShippingAddrDao;
import com.niit.infatuation.dao.SupplierDao;
import com.niit.infatuation.dao.UserDao;
import com.niit.infatuation.daoimpl.AuthenticationDaoImpl;
import com.niit.infatuation.daoimpl.BillingAddrDaoImpl;
import com.niit.infatuation.daoimpl.CardDaoImpl;
import com.niit.infatuation.daoimpl.CartDaoImpl;
import com.niit.infatuation.daoimpl.CartItemDaoImpl;
import com.niit.infatuation.daoimpl.CategoryDaoImpl;
import com.niit.infatuation.daoimpl.OrderDaoImpl;
import com.niit.infatuation.daoimpl.OrderItemDaoImpl;
import com.niit.infatuation.daoimpl.PayDaoImpl;
import com.niit.infatuation.daoimpl.ProductDaoImpl;
import com.niit.infatuation.daoimpl.ShippingAddrDaoImpl;
import com.niit.infatuation.daoimpl.SupplierDaoImpl;
import com.niit.infatuation.daoimpl.UserDaoImpl;
import com.niit.infatuation.model.Authentication;
import com.niit.infatuation.model.BillingAddr;
import com.niit.infatuation.model.Card;
import com.niit.infatuation.model.Cart;
import com.niit.infatuation.model.CartItem;
import com.niit.infatuation.model.Category;
import com.niit.infatuation.model.Order;
import com.niit.infatuation.model.OrderItem;
import com.niit.infatuation.model.Pay;
import com.niit.infatuation.model.Product;
import com.niit.infatuation.model.ShippingAddr;
import com.niit.infatuation.model.Supplier;
import com.niit.infatuation.model.User;

@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement

public class ApplicationContextConfig {
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/eproj3");
		dataSource.setUsername("sa");
		dataSource.setPassword("sa");
		return dataSource;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
	    properties.put("hibernate.connection.pool_size", "10");
        properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

		return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Authentication.class);
		sessionBuilder.addAnnotatedClass(BillingAddr.class);
		sessionBuilder.addAnnotatedClass(Card.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(CartItem.class);
		sessionBuilder.addAnnotatedClass(Order.class);
		sessionBuilder.addAnnotatedClass(OrderItem.class);
		sessionBuilder.addAnnotatedClass(Pay.class);
		sessionBuilder.addAnnotatedClass(ShippingAddr.class);
		// sessionBuilder.addAnnotatedClass(Chart.class);
		// sessionBuilder.addAnnotatedClass(Event.class);
		// sessionBuilder.addAnnotatedClass(FriendList.class);
		// sessionBuilder.buildMapping(net.viralpatel.hibernate.UserDetails2);
		return sessionBuilder.buildSessionFactory();
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}

	@Autowired
	@Bean(name = "categoryDao")
	public CategoryDao getCategoryDao(SessionFactory sessionFactory) {
		return new CategoryDaoImpl(sessionFactory);
	}

	@Autowired
	@Bean(name = "supplierDao")
	public SupplierDao SupplierDaoget(SessionFactory sessionFactory) {
		return new SupplierDaoImpl(sessionFactory);
	}
	
	@Autowired
	@Bean(name = "productDao")
	public ProductDao ProductDaoget(SessionFactory sessionFactory) {
		return new ProductDaoImpl(sessionFactory);
	}



	@Autowired
	@Bean(name = "userDao")
	public UserDao UserDaoget(SessionFactory sessionFactory) {
		return new UserDaoImpl(sessionFactory);
	}
	
	@Autowired
	@Bean(name = "authenticationDao")
	public AuthenticationDao AuthenticationDaoget(SessionFactory sessionFactory) {
		return new AuthenticationDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name = "billingDao")
	public BillingAddrDao BillingAddrDaoget(SessionFactory sessionFactory) {
		return new BillingAddrDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name = "cardDao")
	public CardDao CardDaoget(SessionFactory sessionFactory) {
		return new CardDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name = "cartDao")
	public CartDao CartDaoget(SessionFactory sessionFactory) {
		return new CartDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name = "cartItemDao")
	public CartItemDao CartItemDaoget(SessionFactory sessionFactory) {
		return new CartItemDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name = "orderDao")
	public OrderDao OrderDaoget(SessionFactory sessionFactory) {
		return new OrderDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name = "orderItemDao")
	public OrderItemDao OrderItemDaoget(SessionFactory sessionFactory) {
		return new OrderItemDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name = "payDao")
	public PayDao PayDaoget(SessionFactory sessionFactory) {
		return new PayDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name = "shippingAddrDao")
	public ShippingAddrDao ShippingAddrDaoget(SessionFactory sessionFactory) {
		return new ShippingAddrDaoImpl(sessionFactory);
	}

	// @Autowired
	// @Bean(name = "eventDao")
	// public EventDao getEventDao(SessionFactory sessionFactory) {
	// return new EventDaoImpl(sessionFactory);
	// }
	//
	// }

}