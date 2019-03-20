package com.juanma.rest.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.juanma.rest.service.UserService;
import com.juanma.rest.service.dto.User;

@Component
@Path("/facebook")
public class FacebookRestful {
	
	@Autowired
	private UserService userService;

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public User getUserById(@PathParam("id") String id, User user) {
		
		User result = new User();
		
		result = userService.getUserById(id);
		
		result.setYears(Integer.valueOf(user.getId()));
		
		return result;
		
	}
	
}
