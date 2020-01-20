package com.learnspringboot.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learnspringboot.model.User;

public interface UserRepository extends CrudRepository<User,String> {
	
}
