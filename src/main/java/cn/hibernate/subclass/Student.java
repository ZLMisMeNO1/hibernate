/** 
 * Project Name:hibernate 
 * File Name:Student.java 
 * Package Name:cn.hibernate.subclass 
 * Date:2017年8月4日下午4:39:50 
 * 
 */  
  
package cn.hibernate.subclass;  
/** 
 * ClassName:Student 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月4日 下午4:39:50 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Student extends Person{

	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
}
 