package mum.edu.cs544.mumBidApp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


public class AddressDto {

	private int id;
	private String street;
	private String city;
	private String state;
	private String country;

	private List<RegisterUserDto> userList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<RegisterUserDto> getUserList() {
		return userList;
	}
	public void setUserList(List<RegisterUserDto> userList) {
		this.userList = userList;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
