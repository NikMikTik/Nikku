package com.dto;

import java.sql.Date;

public class BlogDto {

	private int Blog_id;
	private String Type;
	private String Blog;
	private String Rating;
	private Date blog_date;
	private int comments;
	
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
}
