package com.dailycodebuffer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.model.User;
import com.dailycodebuffer.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean saveUser(User user) {
		return userDao.saveUser(user);
	}

	@Override
	public List<User> fetchAllUser() {
		return userDao.fetchAllUser();
	}

	@Override
	public User fetchUserById(Long id) {
		return userDao.fetchUserById(id);
	}

	@Override
	public boolean deleteUser(Long id) {
		return userDao.deleteUser(id);
	}
	
}
