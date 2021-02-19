package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


import logic.CreateUser;
import logic.User;

public class CreateUserTest 
{
	@Test
	public void testCreateUser()
	{
		CreateUser control = new CreateUser();
		User user=control.create("email","password");
		boolean evaluate;
		if((user.getEmail()=="email")&&(user.getPassword()=="password"))
		{
			evaluate = true;
		}
		else
		{
			evaluate = false;
		}
		assertEquals(true,evaluate);
	}
	
}
