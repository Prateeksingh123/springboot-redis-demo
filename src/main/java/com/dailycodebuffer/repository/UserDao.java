package com.dailycodebuffer.repository;

import java.util.List;

import com.dailycodebuffer.model.User;

public interface UserDao {
	
	boolean saveUser(User user);
	
	List<User> fetchAllUser();
	
	User fetchUserById(Long id);
	
	boolean deleteUser(Long id);
}
