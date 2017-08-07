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
import cn.hibernate.subclass.Person;
import cn.hibernate.subclass.Student;
import cn.hibernate.subclass.Teacher;


/** 
 * ClassName:Day11 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月1日 上午10:20:50 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class TestSubclass {
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
		Person p = (Person) session.get(Person.class, 1);
		System.out.println(p);
		
		Student s = (Student) session.get(Student.class, 2);
		System.out.println(s);
	}
	@Test
	public void testSave() {
		Person p = new Student();
		p.setAge(1111);
		p.setName("student-person-test");
		session.save(p);
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
 