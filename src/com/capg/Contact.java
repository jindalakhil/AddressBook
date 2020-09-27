package com.capg;

public class Contact {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	long zip;
	String phoneNumber;
	String email;
	
	public Contact(String firstName, String lastName, String address, String city, String state, long zip, String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
}
