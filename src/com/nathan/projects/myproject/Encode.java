package com.nathan.projects.myproject;

public class Encode {

	Util u = new Util();
	public String encode(String input) {
		if(input.length() > 1) {
			String k = "";
			String o = "";
			String[] s = input.split("");
			for(int i = 0; i < s.length; i++) {
					k = u.key.getKey(s[i]);
					o = o + k;
					return  o; 
			}
		} else {
			String k = u.key.getKey(input);
			return k;
		}

		
		return null;
		
	}
}
