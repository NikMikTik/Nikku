package com.service;




import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

public interface UserService {

	
	

	
	public boolean Register(User uu);
	/*{ur.save(uu);
		
	}
*/
	public User findByEmailAndPassword(String email,String password);
	public User findByEmail(String email);
}