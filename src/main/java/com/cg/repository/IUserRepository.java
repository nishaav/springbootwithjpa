package com.cg.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.entities.User;

public interface IUserRepository extends CrudRepository<User,Integer>{

	
	
}
