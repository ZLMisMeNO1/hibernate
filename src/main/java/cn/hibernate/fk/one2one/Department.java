/** 
 * Project Name:hibernate 
 * File Name:Department.java 
 * Package Name:cn.hibernate.fk.one2one 
 * Date:2017年8月3日下午4:49:35 
 * 
 */  
  
package cn.hibernate.fk.one2one;  
/** 
 * ClassName:Department 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月3日 下午4:49:35 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Department {

	private Integer deptId;
	private String deptName;
	private Manager mgr;
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Manager getMgr() {
		return mgr;
	}
	public void setMgr(Manager mgr) {
		this.mgr = mgr;
	}
	
}
 