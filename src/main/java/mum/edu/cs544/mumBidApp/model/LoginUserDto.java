package mum.edu.cs544.mumBidApp.model;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginUserDto {
	@Pattern(regexp=".+@mum+\\.edu+", message="Enter a valid mum email ID")
	@NotEmpty
	private String eMail;
	@NotEmpty
	private String password;
	
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
