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

import cn.hibernate.fk.one2one.Department;
import cn.hibernate.fk.one2one.Manager;
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
public class Day13 {
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
		Department dept = (Department) session.get(Department.class, 16);
		System.out.println(dept);
		Manager mgr = dept.getMgr();
		System.out.println(mgr);
	}
	@Test
	public void testSave() {
		Manager mgr= new Manager();
		mgr.setMgrName("manager-2");
		
		Department dept = new Department();
		dept.setDeptName("department-2");
		
		dept.setMgr(mgr);
		mgr.setDept(dept);
		session.save(mgr);
		session.save(dept);
		
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
 