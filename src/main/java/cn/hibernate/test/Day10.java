/** 
 * Project Name:hibernate 
 * File Name:Day10.java 
 * Package Name:cn.hibernate.test 
 * Date:2017年7月31日下午3:48:08 
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

import cn.hibernate.pojo.Pay;
import cn.hibernate.pojo.Worker;

/** 
 * ClassName:Day10 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月31日 下午3:48:08 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Day10 {

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
	public void testCo() {
		Pay pay = new Pay();
		pay.setMonthlyPay(1000);
		pay.setYearPay(80000);
		pay.setVocationWithPay(5);
		Worker worker = new Worker();
		worker.setName("ABCD");
		worker.setPay(pay);
		session.save(worker);
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
 