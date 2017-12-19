package mum.edu.cs544.mumBidApp.service;

import mum.edu.cs544.mumBidApp.model.LoginUserDto;
import mum.edu.cs544.mumBidApp.model.RegisterUserDto;

public interface UserService {
	public boolean registerUser(RegisterUserDto user);
	public boolean loginUser(LoginUserDto user);

}
