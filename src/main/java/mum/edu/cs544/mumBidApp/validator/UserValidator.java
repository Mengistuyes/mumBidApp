package mum.edu.cs544.mumBidApp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import mum.edu.cs544.mumBidApp.model.RegisterUserDto;


@Component
public class UserValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return RegisterUserDto.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		RegisterUserDto user = (RegisterUserDto)target;
		if(user.getPassword()!=null && user.getConfPassword()!=null) {
			if(!user.getPassword().equals(user.getConfPassword())) {
				  //errors.rejectValue("password","user.password");
				  errors.rejectValue("password", "negativeValue", new Object[]{"'id'"}, "password and confirm password do not match");
			}
		}
	}

}
