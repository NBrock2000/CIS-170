package com.nathan.week2;

//App is the entry point to our application.
public class App {

	public static void main(String[] argz) {
		User u1 = new User();
		u1.setFirstName("Nathan");
		u1.setLastName("Brock");
		u1.setEmail("nathan@brock.com");
		u1.setUserName("nbrock");
		
		User u2 = new User();
		u2.setFirstName("Joe");
		u2.setLastName("Bob");
		u2.setEmail("joe@bob.com");
		u2.setUserName("jbob");
		
		User u3 = new User();
		u3.setFirstName("Daniel");
		u3.setLastName("Keyboard");
		u3.setEmail("daniel@keyboard.com");
		u3.setUserName("dkeyboard");
		
		User u4 = new User();
		u4.setFirstName("Gaming");
		u4.setLastName("PC");
		u4.setEmail("gaming@pc.com");
		u4.setUserName("gpc");
		
		System.out.println("Name: " + u1.getFirstName() + " " + u1.getLastName() + " || Email: " + u1.getEmail() + " || UserName: " + u1.getUserName());
		System.out.println("Name: " + u2.getFirstName() + " " + u2.getLastName() + " || Email: " + u2.getEmail() + " || UserName: " + u2.getUserName());
		System.out.println("Name: " + u3.getFirstName() + " " + u3.getLastName() + " || Email: " + u3.getEmail() + " || UserName: " + u3.getUserName());
		System.out.println("Name: " + u4.getFirstName() + " " + u4.getLastName() + " || Email: " + u4.getEmail() + " || UserName: " + u4.getUserName());
		
		//for loops
		for(int x = 0; x < 100; x++) {
			System.out.println(x);
		}
	
	}
	// Prompt user to guess a letter
	// Prompt user with mask (recalculate mask)
	
	private void generateMask() {
		
	}
}
