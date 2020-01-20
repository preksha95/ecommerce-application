package com.learnspringboot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspringboot.model.User;
import com.learnspringboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		List<User> usersList=new ArrayList<User>();
		Iterator<User> users= userRepository.findAll().iterator();
		while(users.hasNext()) {
			usersList.add(users.next());
		}
		return usersList;
	}
	
	@Override
	public User getUserById(String user_id) {
		return userRepository.findById(user_id).get();
	}
	@Override
	public Boolean createUser(User user) {
		
		return (user.getUser_id().equalsIgnoreCase(userRepository.save(user).getUser_id())) ? true: false; 
		
	}
	@Override
	public Boolean updateUser(User user) {
		
		return (user.getUser_id().equalsIgnoreCase(userRepository.save(user).getUser_id())) ? true: false; 

	}
	@Override
	public Boolean modifyUserData(User user) {
		
		User updatedUser=userRepository.findById(user.getUser_id()).get();
		if(user.getName()!=null)
			updatedUser.setName(user.getName());
		if(user.getDate_of_birth()!=null)
			updatedUser.setDate_of_birth(user.getDate_of_birth());
		if(user.getEmail_id()!=null)
			updatedUser.setEmail_id(user.getEmail_id());
		if(user.getGender()!=null)
			updatedUser.setGender(user.getGender());
		if(user.getPassword()!=null)
			updatedUser.setPassword(user.getPassword());
		if(user.getPhone_number()!=null)
			updatedUser.setPhone_number(user.getPhone_number());
		
		
		return (user.getUser_id().equalsIgnoreCase(userRepository.save(updatedUser).getUser_id())) ? true: false; 
	}
	@Override
	public void deleteUserById(String user_id) {
		
		userRepository.deleteById(user_id);
	}
	

	

}
