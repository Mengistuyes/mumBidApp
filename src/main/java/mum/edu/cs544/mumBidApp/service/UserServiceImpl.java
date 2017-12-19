package mum.edu.cs544.mumBidApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.mumBidApp.DAO.UserDao;
import mum.edu.cs544.mumBidApp.dmain.User;
import mum.edu.cs544.mumBidApp.model.LoginUserDto;
import mum.edu.cs544.mumBidApp.model.RegisterUserDto;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public boolean registerUser(RegisterUserDto userDto) {
		User userEntity = new User(userDto.getFirstName(), userDto.getLastName(), userDto.getMobile(), 
								userDto.geteMail(), userDto.getPassword(), userDto.getConfPassword());
		
		if(!userDto.getPassword().equals(userDto.getConfPassword())) {
			return false;
		}else {
			return userDao.registerUser(userEntity);
			
		}
	}

	@Transactional
	public boolean loginUser(LoginUserDto userDto) {
		return userDao.loginUser(userDto);
	}
}
