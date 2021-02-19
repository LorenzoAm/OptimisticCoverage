package logic;

public class CreateUser
{
	
	public User create(String email,String password)
	{
		return new User(email,password);
	}
}
