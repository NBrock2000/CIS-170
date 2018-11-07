package com.nathan.projects.hangman_v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;





public class Main {
	
	public String word;
	
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
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
	public void genWord() {
		Main m = new Main();
		Random r =  new Random();
		int w = r.nextInt(words.size());
		m.setWord(words.get(w).toString());
		System.out.println(m.getWord());
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		try {
			m.loadFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		m.genWord();
		
		
		
	}
}
