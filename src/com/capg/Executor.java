package com.capg;

import java.io.*;
import java.util.*;


public class Executor {
	private static TreeMap<String, AddressBook> tm = new TreeMap<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Executor ex = new Executor();
		int i =1;
		while(i!=0) {
			System.out.println("Enter 1 to create new address book");
			System.out.println("Enter 2 to edit existing address book");
			System.out.println("Enter 3 to delete addressbook");
			System.out.println("Enter 0 to exit");
			String name = null;
			i = sc.nextInt();
			sc.nextLine();
			switch(i) {
			case 1:
				System.out.println("Enter the name for address book you want to create");
				name = sc.nextLine();
				ex.createAddressBook(name, sc);
				break;
			case 2:
				System.out.println("Enter the name for address book you want to edit");
				Set set = tm.entrySet();
			    Iterator it = set.iterator();
			 
			    // Display elements
			    while(it.hasNext()) {
			      Map.Entry me = (Map.Entry)it.next();
			      System.out.print("AddressBook is: "+me.getKey() );
			    } 
				name = sc.nextLine();
				ex.editAddressBook(name);
				break;
			case 3:
				System.out.println("Enter the name for address book you want to delete");
				name = sc.nextLine();
				ex.deleteAddressBook(name);
				break;
			case 0:
				System.out.println("Exiting the process");
				break;
			default:
				System.out.println("Enter valid entry");
			}
		}
	}
	
	public void createAddressBook(String name, Scanner sc) {
		if(checkExistance(name)) {
			System.out.println("AddressBook with this name already esists");
			return;
		}
		AddressBook book = new AddressBook(name);
		tm.put(name, book);
		System.out.println("If you want to add contacts to " + name + " press y");
		if("y".equals(sc.nextLine())) {
			editAddressBook(name);
		}
	}
	
	public void editAddressBook(String name) {
		if(!checkExistance(name)) {
			System.out.println("AddressBook with this name don't esists");
			return;
		}
		AddressBook book = tm.get(name);
		System.out.println("You are currently in: " + book.getName());
		AddressFunction fun = new AddressFunction();
		fun.function(book);
	}
	
	public void deleteAddressBook(String name) {
		if(checkExistance(name)) {
			tm.remove(name);
			System.out.println("AddressBook with name " + name + " deleted.");
			return;
		}
		System.out.println("AddressBook with this name not esists");
	}
	
	public boolean checkExistance(String name) {
		if(tm.containsKey(name)) {
			return true;
		}
		return false;
	}

}
