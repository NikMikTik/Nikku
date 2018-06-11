package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.BlogDto;
import com.dto.UserDto;
import com.model.Blog;
import com.model.User;
import com.repository.BlogRepository;
import com.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private BlogRepository blogRepository;
	
	
@Autowired
private final UserRepository ur;
	
	public UserServiceImpl(UserRepository ur)
	{this.ur=ur;}
	
	
	@Override
	public boolean Register(User uu) {
		boolean value=false;String emailcheck=uu.getEmail();
		if(ur.findByEmail(emailcheck) == null)
		{ur.save(uu);
		value=true;}
		return value;
			
	}

	@Override
	public User findByEmailAndPassword(String email, String password) {
		return ur.findByEmailAndPassword(email, password);
		
	}
	public List<BlogDto> fetchAllBlog(){
		List<Blog> blogs = blogRepository.findAll();
		return blogAssembler(blogs);
	}
	
	private List<BlogDto> blogAssembler(List<Blog> blogs){
		List<BlogDto> blogList = new ArrayList<>();
		blogs.forEach(blog -> {
			BlogDto blogDto = new BlogDto();
			blogDto.setBlog(blog.getBlog());
			blogDto.setBlog_id(blog.getBlog_id());
			blogDto.setRating(blog.getRating());
			blogDto.setType(blog.getType());
			blogDto.setComments(blog.getComments());
			blogDto.setBlog_date(blog.getBlog_date());
			blogList.add(blogDto);
		});
		return blogList;
	}

	public List<UserDto> fetchAllUser()
	{List<User> users = ur.findAll();
		return UserAssembler(users);
		
	}
	
	private List<UserDto> UserAssembler(List<User> users)
	{	List<UserDto>  userList=new ArrayList<>();
	users.forEach(user -> {
		UserDto userDto =new UserDto();
		userDto.setUser_id(user.getUser_id());
		userDto.setUsername(user.getUser_name());
		userDto.setPassword(user.getPassword());
		userDto.setEmail(user.getEmail());
		userList.add(userDto);
	});
		return userList;
		
	}


	@Override
	public User findByEmail(String email) {
		return ur.findByEmail(email);
		
	}
}
