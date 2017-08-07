/** 
 * Project Name:hibernate 
 * File Name:Worker.java 
 * Package Name:cn.hibernate.pojo 
 * Date:2017年7月31日下午3:41:58 
 * 
 */  
  
package cn.hibernate.pojo;  
/** 
 * ClassName:Worker 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月31日 下午3:41:58 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Worker {

	private Integer id;
	private String name;
	private Pay pay;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pay getPay() {
		return pay;
	}
	public void setPay(Pay pay) {
		this.pay = pay;
	}
	
}
 