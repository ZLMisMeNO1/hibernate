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

import cn.hibernate.n21.Customer;
import cn.hibernate.n21.Order;
import cn.hibernate.pojo.Pay;
import cn.hibernate.pojo.Worker;
/** 
 * ClassName:Day11 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月1日 上午10:20:50 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Day11 {
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
	public void testDelete() {
		Customer customer = (Customer) session.get(Customer.class, 1);
		session.delete(customer);
	}
	@Test
	public void testUpdate() {
		Order order = (Order) session.get(Order.class, 1);
		order.getCustomer().setCustomerName("182dj");
	}
	@Test
	public void testMany2OneGet(){
		Order order = (Order) session.get(Order.class, 1);
		System.out.println(order.getOrderName());
	}
	@Test
	public void testManyToOne(){
		Customer customer = new Customer();
		customer.setCustomerName("EE");
		Order order1 = new Order();
		order1.setCustomer(customer);
		order1.setOrderName("EEE");
		Order order2 = new Order();
		order2.setCustomer(customer);
		order2.setOrderName("FFF");
		
		session.save(order1);
		session.save(order2);
		session.save(customer);
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
 