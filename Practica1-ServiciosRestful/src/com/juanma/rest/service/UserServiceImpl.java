package com.juanma.rest.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanma.rest.dao.UserDAO;
import com.juanma.rest.service.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Override
	public User getUserById(String id) {
		
		User user = new User();
		
		if(StringUtils.isNotEmpty(id)) {
			
			user = userDao.getUserById(id);
			
		}
		
		return user;
		
	}
	
}
