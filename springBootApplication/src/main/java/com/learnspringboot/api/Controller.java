package com.learnspringboot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringboot.model.User;
import com.learnspringboot.service.UserService;
import com.learnspringboot.service.UserServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/")
	public String getGreeting() {
		return "Welcome to Market";
	}
	
	@RequestMapping(value="/users")
	public List<User> getAllUsersList() {
		return userService.getAllUsers();
				
	}
	
	@RequestMapping(value="/user/{user_id}")
	public User getUserById(@PathVariable String user_id) {
		return userService.getUserById(user_id);
	}
	
	@RequestMapping(value = "/user", method=RequestMethod.POST)
	public void addUser(@RequestBody User user ) {
	    userService.createUser(user);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.PUT)
	public Boolean updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.PATCH)
	public Boolean modifyUserData(@RequestBody User user) {
		return userService.modifyUserData(user);
	}
	
	@RequestMapping(value="/user/{user_id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable String user_id) {
		userService.deleteUserById(user_id);
	}
	
	
		
}
