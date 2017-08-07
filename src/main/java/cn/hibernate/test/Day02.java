/** 
 * Project Name:hibernate 
 * File Name:Day02.java 
 * Package Name:cn.hibernate.test 
 * Date:2017年7月28日下午4:12:59 
 * 
 */  
  
package cn.hibernate.test;  

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;











import cn.hibernate.pojo.News;

/** 
 * ClassName:Day02 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月28日 下午4:12:59 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Day02 {
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
	public void saveOne(){
		News news = new News("java1","great",new Date(new java.util.Date().getTime()));
		session.save(news);
		System.out.println(news);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sdf.format(news.getDate()));
	}
	@Test
	public void doIt () {
		News query = (News) session.get(News.class, 14);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss e a");
		System.out.println(sdf.format(query.getDate()));
	}
	@Test
	public void testDynamicUpdate(){
		News news = (News) session.get(News.class, 5);
		System.out.println(news);
		news.setTitle(null);
		session.update(news);
	}
	@Test
	public void testBlob() throws Exception{
		News news = new News();
		news.setAuthor("abc");
		news.setDate(new Date(System.currentTimeMillis()));
		news.setTitle("image");
		InputStream stream = new FileInputStream("Penguins.jpg");
		Blob image = Hibernate.getLobCreator(session).createBlob(stream, stream.available());
		news.setImage(image);
		session.save(news);
		
	}
	@Test
	public void aaa(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","root","admin");
			System.out.println(conn);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Test
	public void testDoWork() {
		session.doWork(new Work(){

			public void execute(Connection connection) throws SQLException {
				System.out.println(connection);
			}});
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
 