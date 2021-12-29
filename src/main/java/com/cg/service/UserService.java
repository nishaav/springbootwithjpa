package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entities.User;
import com.cg.repository.IUserRepository;

@Service
public class UserService 
{

	@Autowired 
	public IUserRepository iUserRepository;
	
	public String addRecord(String name,String contact)
	{
		try
		{
			User user=new User();
			user.setUserName(name);
			user.setUserContact(contact);
			iUserRepository.save(user);
			return "success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "fail";
	}
}
