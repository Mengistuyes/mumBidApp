package mum.edu.cs544.mumBidApp.DAO;

import mum.edu.cs544.mumBidApp.dmain.User;
import mum.edu.cs544.mumBidApp.model.LoginUserDto;

public interface UserDao {
	public boolean registerUser(User user);
	public boolean loginUser(LoginUserDto user);
}
