package com.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsernameAndPassword(String username,String password);

	public User findByEmailAndPassword(String email, String password);
	
	public User findByEmail(String email);
	
}
