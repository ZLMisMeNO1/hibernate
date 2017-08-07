/** 
 * Project Name:hibernate 
 * File Name:Customer.java 
 * Package Name:cn.hibernate.n21 
 * Date:2017年8月1日上午10:10:30 
 * 
 */  
  
package cn.hibernate.n21;  
/** 
 * ClassName:Customer 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月1日 上午10:10:30 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Customer {
	private Integer customerId;
	private String customerName;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + "]";
	}
	
}
 