/** 
 * Project Name:hibernate 
 * File Name:Category.java 
 * Package Name:cn.hibernate.n2n 
 * Date:2017年8月4日下午2:32:23 
 * 
 */  
  
package cn.hibernate.n2n;  

import java.util.HashSet;
import java.util.Set;

/** 
 * ClassName:Category 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月4日 下午2:32:23 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Category {

	private Integer cid;
	private String cName;
	private Set<Item> items = new HashSet<Item>();
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
}
 