package com.nathan.projects.hangman_v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;





public class Main {

	List<Words> words = new ArrayList<Words>();
	public void loadFile() throws IOException {
		File f = new File("src/com/nathan/projects/hangman_v2/Util.txt");
		if(f.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s;
			while((s = br.readLine()) != null) {
				Words w = new Words();
				w.setString(s);
				words.add(w);
				
				
				
			}
		}
	}
	Random r =  new Random();
	private int w = r.nextInt(words.size());
	public String word = words.get(w).toString();
	public static void main(String[] args) {
		Main m = new Main();
		try {
			m.loadFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
