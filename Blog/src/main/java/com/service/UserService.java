package com.service;




import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

public interface UserService {

	
	

	
	public void Register(User uu);
	/*{ur.save(uu);
		
	}
*/
	public User findByUsernameAndPassword(String username,String password);
	/*{return ur.findByUsernameAndPassword(username, password);}
}
*/}