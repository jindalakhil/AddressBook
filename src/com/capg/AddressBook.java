package com.capg;
import java.util.*;

public class AddressBook {
	
	private String name = null;
	
	public AddressBook(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	List<Contact> book = new ArrayList<>();

	public List<Contact> getBook() {
		return book;
	}

	public void setBook(List<Contact> book) {
		this.book = book;
	}
	
	public void viewBook(List<Contact> book) {
		for(Contact c : book) {
			System.out.println(c);
		}
	}
	
	public void addContact(Contact contact) {
		book.add(contact);
	}
	
	public String updateContact(String firstName, Scanner sc) {
		 int y=0;
		 for(Contact x: book) {
			 if(x.firstName.equalsIgnoreCase(firstName)) {
			 int i =1;
			 while(i!=0) {
				 System.out.println("Enter 1 to update th last name");
				 System.out.println("Enter 2 to update the address");
				 System.out.println("Enter 3 to update the city");
				 System.out.println("Enter 4 to update the state");
				 System.out.println("Enter 5 to update the zipcode");
				 System.out.println("Enter 6 to update the phone number");
				 System.out.println("Enter 7 to update the email");
				 System.out.println("Enter 0 to exit");
				 i = sc.nextInt();
				 sc.nextLine();
				 switch(i) {
				 case 1:
					 System.out.println("Enter the new last name");
					 x.lastName = sc.nextLine();
					 System.out.println("last name updated");
					 break;
				 case 2:
					 System.out.println("Enter the new address");
					 x.address = sc.nextLine();
					 System.out.println("address updated");
					 break;
				 case 3:
					 System.out.println("Enter the new city");
					 x.city = sc.nextLine();
					 System.out.println("city updated");
					 break;
				 case 4:
					 System.out.println("Enter the new state");
					 x.state = sc.nextLine();
					 System.out.println("state updated");
					 break;
				 case 5:
					 System.out.println("Enter the new zipcode");
					 x.zip = sc.nextLong();
					 System.out.println("zipcode updated");
					 break;
				 case 6:
					 System.out.println("Enter the new phonenumber");
					 x.phoneNumber = sc.nextLine();
					 System.out.println("phonenumber updated");
					 break;
				 case 7:
					 System.out.println("Enter the new email");
					 x.email = sc.nextLine();
					 System.out.println("email updated");
					 break;
				 case 0:
					 System.out.println("Exiting the updation process");
					 break;
				 default:
					 System.out.println("Invalid Entry! Enter a new one");
				 }	 
			 }
			 y=1;
			 }
			 }
		 if(y==1)
			 return "Contact updated";
		 else
			 return "No contact found with this name";
	 }
	
	public void deleteContact(String firstName) {
		for(Contact x : book) {
			if(x.firstName.equalsIgnoreCase(firstName)) {
				book.remove(x);
				System.out.println("Contact deleted");
				return;
			}
		}
		System.out.println("Contact not found");
	}
	
	public boolean hasContact(String firstName) {
		for(Contact x : book) {
			if(x.firstName.equalsIgnoreCase(firstName)) {
				return true;
			}
		}
		return false;
	}
}
