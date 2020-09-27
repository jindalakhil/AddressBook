package com.capg;

public class Executor {

	public static void main(String[] args) {
		System.out.println("Welcome to Adress Book");
		Contact contact = new Contact("first", "last","address","city","state",12345,"phone","email");
		AddressBook obj = new AddressBook();
		obj.addContact(contact);
		obj.viewBook(obj.getBook());
	}

}
