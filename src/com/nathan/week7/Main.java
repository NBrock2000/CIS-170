package com.nathan.week7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	
	
	public void addUser() {
		
	}
	
	public List<User> loadUsers() throws IOException {
		File f = new File("src/com/nathan/week7/Document.txt");
		System.out.println("File: " + f.exists());
		List<User> users = new ArrayList<User>();
		if(f.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s;
			while((s = br.readLine()) != null) {
				
				String[] splitNames = s.split(" ");
				User u = new User();
				u.setFirst_name(splitNames[0]);
				if(splitNames.length > 2) {
					u.setMiddle_name(splitNames[1]);
					u.setLast_name(splitNames[2]);
				}
				else {
					u.setLast_name(splitNames[1]);
					u.setMiddle_name("");
				}
				users.add(u);
				//System.out.println(s);
				
			}
		}
		return users;
	}
	
	public static void main(String[] args) {
		
		Main m = new Main();
		try {
			List<User> users = m.loadUsers();
			for(User user : users) {
				System.out.println("First Name: " + user.getFirst_name() + "  |  Middle Name: " + user.getMiddle_name() + "  |  Last Name: " + user.getLast_name());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
