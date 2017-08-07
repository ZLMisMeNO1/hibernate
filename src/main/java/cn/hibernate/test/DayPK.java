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

import cn.hibernate.n2n.Category;
import cn.hibernate.n2n.Item;
import cn.hibernate.pk.one2one.Department;
import cn.hibernate.pk.one2one.Manager;


/** 
 * ClassName:Day11 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月1日 上午10:20:50 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class DayPK {
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
	public void testGet() {
	}
	@Test
	public void testSave() {
		Item item1 = new Item();
		item1.setItemName("item-1");
		Item item2 = new Item();
		item2.setItemName("item-2");
		Category category = new Category();
		category.setcName("category-1");
		
		category.getItems().add(item1);
		category.getItems().add(item2);
		session.save(item1);
		session.save(item2);
		session.save(category);
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
 