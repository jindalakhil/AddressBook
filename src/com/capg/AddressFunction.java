package com.capg;

import java.util.Scanner;

public class AddressFunction {

	public void function(AddressBook book) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Adress Book " + book.getName());
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (i != 0) {
			String firstName = "";
			System.out.println("Enter 1 to add a contact");
			System.out.println("Enter 2 to edit the contact");
			System.out.println("Enter 3 to delete the contact");
			System.out.println("Enter 0 to exit");
			i = sc.nextInt();
			sc.nextLine();
			switch (i) {
			case 1:
				System.out.println("Enter the first name: ");
				String fname = sc.nextLine();
				if(book.hasContact(fname)) {
					System.out.println("contact already exists");
				} else {
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
					book.addContact(contact);
					book.viewBook(book.getBook());
				}
				break;
		
			case 2:
				System.out.println("Update Contact:");
				System.out.println("Enter first name: ");
				firstName = sc.nextLine();
				book.updateContact(firstName, sc);
				break;
			case 3:
				System.out.println("Delete Contact:");
				book.viewBook(book.book);
				System.out.println("Enter first name: ");
				firstName = sc.nextLine();
				book.deleteContact(firstName);
				book.viewBook(book.book);
				break;
			case 0:
				System.out.println("Exiting the process");
				break;
			default:
				System.out.println("Enter valid entry");
			}
		}

	}
}
