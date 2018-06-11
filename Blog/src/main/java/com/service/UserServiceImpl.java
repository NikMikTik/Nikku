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
	public void Register(User uu) {
		ur.save(uu);
			
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		return ur.findByUsernameAndPassword(username, password);
		
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
	
	public List<UserDto> UserAssembler(List<User> users)
	{
		User u=new User();
		List<UserDto>  userList=new ArrayList<>();
	for (UserDto userDto : userList) {
		userDto.setUser_id(u.getUser_id());
		userDto.setUsername(u.getUser_name());
		userDto.setPassword(u.getPassword());
		userDto.setEmail(u.getEmail());
		userList.add(userDto);
	}
		return userList;
		
	}
}
