package com.bgpghunt.first.service;

import java.util.List;
import java.util.Optional;



import com.bgpghunt.first.EntityClass.User;


public interface iUserService {

	List<User> getAUser();
	Optional<User> getbyId(long id);
	User setUser(User user);
	
}
