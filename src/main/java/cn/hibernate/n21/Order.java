/** 
 * Project Name:hibernate 
 * File Name:Order.java 
 * Package Name:cn.hibernate.n21 
 * Date:2017年8月1日上午10:11:01 
 * 
 */  
  
package cn.hibernate.n21;  
/** 
 * ClassName:Order 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月1日 上午10:11:01 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Order {
	private Integer orderId;
	private String orderName;
	private Customer customer;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName
				+ ", customer=" + customer + "]";
	}
}
 