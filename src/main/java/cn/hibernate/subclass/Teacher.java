/** 
 * Project Name:hibernate 
 * File Name:Teacher.java 
 * Package Name:cn.hibernate.subclass 
 * Date:2017年8月4日下午5:21:12 
 * 
 */  
  
package cn.hibernate.subclass;  
/** 
 * ClassName:Teacher 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月4日 下午5:21:12 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Teacher extends Person{

	private String teacherName;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	
}
 