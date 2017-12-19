package mum.edu.cs544.mumBidApp.model;

import javax.persistence.ManyToOne;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class RegisterUserDto {

	private int id;
	@Size(min=3, max=50)
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	private String mobile;
	@Pattern(regexp=".+@mum+\\.edu+", message="Enter a valid mum email ID")
	@NotEmpty
	private String eMail;
	@Size(min=3, max=50)
	@NotEmpty
	private String password;
	@NotEmpty
	private String confPassword;
	private String userName;
	@ManyToOne
	private AddressDto address;
	private String msg;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
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
	public String getConfPassword() {
		return confPassword;
	}
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
