package com.nathan.projects.myproject;

public class Encode {

	private String k = "";
	public String encodeUItoUI() {
		Main m = new Main();
		Util u = new Util();
		if(u.key.contains(m.getSM())) {
			k = (String) u.getKey(m.getSM());
		}
		return k;
	}
}
