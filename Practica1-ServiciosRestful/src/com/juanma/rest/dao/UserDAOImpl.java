package com.juanma.rest.dao;

import org.springframework.stereotype.Service;

import com.juanma.rest.service.dto.User;

@Service
public class UserDAOImpl implements UserDAO {

	@Override
	public User getUserById(String id) {

		User user = new User();
		
		// TODO: Llamada a BBDD
		user.setId(id);
		user.setName("Paco");
		user.setSurname("Perez");
		user.setYears(34);
		
		return user;
		
	}

}
