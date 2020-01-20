package com.learnspringboot.service;

import java.util.List;

import com.learnspringboot.model.User;

public interface UserService {
	
	List<User> getAllUsers();
	User getUserById(String user_id);
	Boolean createUser(User user);
	Boolean updateUser(User user);
	Boolean modifyUserData(User user);
	void deleteUserById(String user_id);
}
