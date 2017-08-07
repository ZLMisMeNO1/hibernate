/** 
 * Project Name:hibernate 
 * File Name:Manager.java 
 * Package Name:cn.hibernate.fk.one2one 
 * Date:2017年8月3日下午4:49:42 
 * 
 */  
  
package cn.hibernate.fk.one2one;  
/** 
 * ClassName:Manager 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月3日 下午4:49:42 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Manager {
	private Integer mgrId;
	private String mgrName;
	private Department dept;
	public Integer getMgrId() {
		return mgrId;
	}
	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}
	public String getMgrName() {
		return mgrName;
	}
	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
}
 