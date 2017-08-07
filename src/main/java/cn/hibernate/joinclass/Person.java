/** 
 * Project Name:hibernate 
 * File Name:Person.java 
 * Package Name:cn.hibernate.subclass 
 * Date:2017年8月4日下午4:39:09 
 * 
 */  
  
package cn.hibernate.joinclass;  
/** 
 * ClassName:Person 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月4日 下午4:39:09 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Person {

	private Integer pid;
	
	private String name;
	
	private Integer age;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
 