package com.capg;
import java.io.*;
import java.util.*;

public class Executor {

	public static void main(String[] args) {
		System.out.println("Welcome to Adress Book");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String fname = sc.nextLine();
		System.out.println("Enter last name: ");
		String lname = sc.nextLine();
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		System.out.println("Enter city: ");
		String city = sc.nextLine();
		System.out.println("Enter state: ");
		String state = sc.nextLine();
		System.out.println("Enter zip: ");
		long zip = sc.nextLong();
		System.out.println("Enter phone number: ");
		sc.nextLine();
		String phoneNumber = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		AddressBook obj = new AddressBook();
		Contact contact = new Contact(fname, lname, address, city, state, zip, phoneNumber, email);
		obj.addContact(contact);
		obj.viewBook(obj.getBook());
	}

}


