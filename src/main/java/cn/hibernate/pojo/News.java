/** 
 * Project Name:hibernate 
 * File Name:News.java 
 * Package Name:cn.hibernate.pojo 
 * Date:2017年7月28日下午3:29:25 
 * 
 */  
  
package cn.hibernate.pojo;  

import java.sql.Blob;
import java.sql.Date;

/** 
 * ClassName:News 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月28日 下午3:29:25 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class News {

	private Integer id ;
	
	private String title;
	
	private String author;
	
	private Date date;

	private String desc;
	
	//大文本
	private String content ;
	//图片
	private Blob image;
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public News() {
		System.out.println("使用了无参构造器");
	}

	public News(String title, String author, Date date) {
		super();
		this.title = title;
		this.author = author;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", author=" + author
				+ ", date=" + date + ", desc=" + desc + "]";
	}

	
	
}
 