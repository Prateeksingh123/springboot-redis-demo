package com.dailycodebuffer.service;

import java.util.List;

import com.dailycodebuffer.model.User;

public interface UserService {
	
	boolean saveUser(User user);
	
	List<User> fetchAllUser();
	
	User fetchUserById(Long id);
	
	boolean deleteUser(Long id);
}
