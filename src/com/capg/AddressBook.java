package com.capg;
import java.util.*;

public class AddressBook {
	List<Contact> book = new ArrayList<>();

	public List<Contact> getBook() {
		return book;
	}

	public void setBook(List<Contact> book) {
		this.book = book;
	}
	
	public void viewBook(List<Contact> book) {
		for(Contact c : book) {
			System.out.println(c.toString());
		}
	}
	
	public void addContact(Contact contact) {
		book.add(contact);
	}
}
