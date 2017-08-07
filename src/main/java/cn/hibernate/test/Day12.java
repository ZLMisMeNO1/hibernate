/** 
 * Project Name:hibernate 
 * File Name:Day11.java 
 * Package Name:cn.hibernate.test 
 * Date:2017年8月1日上午10:20:50 
 * 
 */  
  
package cn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.hibernate.n21.both.Customer;
import cn.hibernate.n21.both.Order;

/** 
 * ClassName:Day11 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月1日 上午10:20:50 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Day12 {
	public SessionFactory sessionFactory = null;
	public Session session = null;
	public Transaction transaction = null;
	
	@Before
	public void connection(){
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		
		ServiceRegistry sr = null;
		
		try{
			sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
			sessionFactory = config.buildSessionFactory(sr);
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	@Test
	public void testQuery(){
		Customer customer = (Customer) session.get(Customer.class, 13);
		System.out.println(customer);
	}
	
	@Test
	public void testCascade() {
		Customer customer = (Customer) session.get(Customer.class, 2);
		System.out.println(customer);
		customer.getOrders().clear();
	}
	@Test
	public void testDelete() {
		Customer customer = (Customer) session.get(Customer.class, 13);
		session.delete(customer);
	}
	@Test
	public void testSave(){
		Customer customer = new Customer();
		customer.setCustomerName("customer-5");
		
		Order order1 = new Order();
		order1.setOrderName("order-55");
		
		Order order2 = new Order();
		order2.setOrderName("order-4555");
		
		order1.setCustomer(customer);
		order2.setCustomer(customer);
		
		customer.getOrders().add(order1);
		customer.getOrders().add(order2);
		session.save(customer);
//		session.save(order1);
//		session.save(order2);
		
		
	}	
	@After
	public void close(){
		transaction.commit();
		if(null != session)
			session.close();
		if(null != sessionFactory)
			sessionFactory.close();
		
	}
}
 