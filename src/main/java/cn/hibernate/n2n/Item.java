/** 
 * Project Name:hibernate 
 * File Name:Item.java 
 * Package Name:cn.hibernate.n2n 
 * Date:2017年8月4日下午2:32:32 
 * 
 */  
  
package cn.hibernate.n2n;  

import java.util.HashSet;
import java.util.Set;

/** 
 * ClassName:Item 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月4日 下午2:32:32 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Item {

	private Integer itemId;
	private String itemName;
	private Set<Category> categories = new HashSet<Category>();
	
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}
 