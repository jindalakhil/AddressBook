package com.capg;

import java.io.*;
import java.util.*;

public class Executor {

	public static void main(String[] args) {
		System.out.println("Welcome to Adress Book");
		AddressBook obj = new AddressBook();
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int contacts =0;
		while (i != 0) {
			String firstName = "";
			System.out.println("Enter 1 to add a contact");
			System.out.println("Enter 2 to edit the contact");
			System.out.println("Enter 3 to delete the contact");
			System.out.println("Enter 0 to exit");
			i = sc.nextInt();
			sc.nextLine();
			if (i > 2) {
				System.out.println("Enter valid entry");
			}
			switch (i) {
			case 1:
				if(contacts<1) {
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
					Contact contact = new Contact(fname, lname, address, city, state, zip, phoneNumber, email);
					obj.addContact(contact);
					obj.viewBook(obj.getBook());
					contacts++;
				} else {
					System.out.println("Add only one contact at this time");
				}
				
				break;
			case 2:
				System.out.println("Update Contact:");
				System.out.println("Enter first name: ");
				firstName = sc.nextLine();
				obj.updateContact(firstName, sc);
				break;
			case 3:
				System.out.println("Delete Contact:");
				System.out.println("Enter first name: ");
				firstName = sc.nextLine();
				obj.deleteContact(firstName);
				obj.viewBook(obj.book);
				break;
			case 0:
				System.out.println("Exiting the process");
			}
		}

	}

}
