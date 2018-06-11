package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;




@Entity
@Table(name="Blog_Table")
public class Blog {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Blog_id;
	private String Type;
	private String Blog;
	private String Rating;
	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	private Date blog_date;
	private int comments;
	
	
	public int getBlog_id() {
		return Blog_id;
	}


	public void setBlog_id(int blog_id) {
		Blog_id = blog_id;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getBlog() {
		return Blog;
	}


	public void setBlog(String blog) {
		Blog = blog;
	}


	public String getRating() {
		return Rating;
	}


	public void setRating(String rating) {
		Rating = rating;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Date getBlog_date() {
		return blog_date;
	}


	public void setBlog_date(Date blog_date) {
		this.blog_date = blog_date;
	}


	public int getComments() {
		return comments;
	}


	public void setComments(int comments) {
		this.comments = comments;
	}


	public Blog(int blog_id, String type, String blog, String rating, User user, Date blog_date, int comments) {
		super();
		Blog_id = blog_id;
		Type = type;
		Blog = blog;
		Rating = rating;
		this.user = user;
		this.blog_date = blog_date;
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "Blog [Blog_id=" + Blog_id + ", Type=" + Type + ", Blog=" + Blog + ", Rating=" + Rating + ", user="
				+ user + ", blog_date=" + blog_date + ", comments=" + comments + "]";
	}


	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	

}
