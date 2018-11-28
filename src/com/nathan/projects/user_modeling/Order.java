package com.nathan.projects.user_modeling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.nathan.week7.User;

public class Order {

	//Address
		private String street;
		private String city;
		private String state;
		private int zipcode;
		
		List<Object> address = new ArrayList<Object>();
		public void addAddress() {
			if(address.isEmpty()) {
				address.add(street);
				address.add(city);
				address.add(state);
				address.add(zipcode);
			} else {
				for(int i = 0; i < address.size(); i++) {
					address.remove(i);
				}
				address.add(street);
				address.add(city);
				address.add(state);
				address.add(zipcode);
			}
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
		public int getZipcode() {
			return zipcode;
		}
		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}
		
	// USERS
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	List<Object> user = new ArrayList<Object>();
	public void addUser() {
		if(user.isEmpty()) {
			user.add(firstName);
			user.add(lastName);
			user.add(email);
			user.add(password);
			//Address a = new Address();
			addAddress();
			user.add(address);
		} else {
			for(int i = 0; i < user.size(); i++) {
				user.remove(i);
			}
			user.add(firstName);
			user.add(lastName);
			user.add(email);
			user.add(password);
			//Address a = new Address();
			addAddress();
			user.add(address);
		}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Order
	private String item;
	private int quanity;
	private double cost;
	
	List<Object> order =  new ArrayList<Object>();
	List<Object> orders = new ArrayList<Object>();
	public void addOrder() throws IOException {
		File f = new File("src/com/nathan/projects/user_modeling/Log.txt");
		System.out.println("File: " + f.exists());
		if(f.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s;
			while((s = br.readLine()) != null) {
				orders.add(s);
			}
		}
		if(order.isEmpty()) {
			order.add(item);
			order.add(quanity);
			order.add(cost);
			//User u =  new User();
			addUser();
			order.add(user);
			orders.add(order);
			for(int i = 0; i < orders.size();i++) {
				System.out.println(orders.toString());
			}
		} else {
			for(int i = 0; i < order.size(); i++) {
				order.remove(i);
			}
			order.add(item);
			order.add(quanity);
			order.add(cost);
			//User u =  new User();
			addUser();
			order.add(user);
		}
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/nathan/projects/user_modeling/Log.txt"));
	    try {
			
			writer.write(orders.toString());
		} 
	    catch (IOException e) 
	    {
			throw e;
		}
	    finally
	    {
	    	writer.close();
	    }
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
