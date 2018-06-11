package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)*/
@Table(name = "User_Table")
/*@DiscriminatorColumn(name="User_Type", discriminatorType=DiscriminatorType.STRING)*/
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer user_id;
	private String username;
	private String password;
	private String Email;
	
	@OneToMany(mappedBy="user")
	private Collection<Blog> blog= new ArrayList<>();
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return username;
	}
	public void setUser_name(String user_name) {
		this.username = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + username + ", Password=" + password + ", Email=" + Email
				+ "]";
	}
	
	
	public User(int user_id) {
		super();
		this.user_id = user_id;
	}
	public User(int user_id, String user_name, String password, String email) {
		super();
		this.user_id = user_id;
		this.username = user_name;
		this.password = password;
		Email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String user_name, String password, String email) {
		super();
		this.username = user_name;
		this.password = password;
		Email = email;
	}
	
	
	
	
	

}
