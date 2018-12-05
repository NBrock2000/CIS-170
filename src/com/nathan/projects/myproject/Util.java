package com.nathan.projects.myproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Util {

	Map<String, String> key = new HashMap<String, String>(100, (float) .95);
	List<String> input = new ArrayList<String>();
	
	public void init() {
		key.put("00100000", " ");
		key.put("00100001", "!");
		key.put("00100010", "\"");
		key.put("00100011", "#");
		key.put("00100100", "$");
		key.put("00100101", "%");
		key.put("00100110", "&");
		key.put("00100111", "'");
		key.put("00101000", "(");
		key.put("00101001", ")");
		key.put("00101010", "*");
		key.put("00101011", "+");
		key.put("00101100", ",");
		key.put("00101101", "-");
		key.put("00101110", ".");
		key.put("00101111", "/");
		key.put("00110000", "0");
		key.put("00110001", "1");
		key.put("00110010", "2");
		key.put("00110011", "3");
		key.put("00110100", "4");
		key.put("00110101", "5");
		key.put("00110110", "6");
		key.put("00110111", "7");
		key.put("00111000", "8");
		key.put("00111001", "9");
		key.put("00111011", ":");
		key.put("00111100", "<");
		key.put("00111101", "=");
		key.put("00111110", ">");
		key.put("00111111", "?");
		key.put("01000000", "@");
		key.put("01000001", "A");
		key.put("01000010", "B");
		key.put("01000100", "C");
		key.put("01000011", "D");
		key.put("01000100", "E");
		key.put("01000101", "F");
		key.put("01000111", "G");
		key.put("01001000", "H");
		key.put("01001001", "I");
		key.put("01001010", "J");
		key.put("01001011", "K");
		key.put("01001100", "L");
		key.put("01001101", "M");
		key.put("01001110", "N");
		key.put("01001111", "O");
		key.put("01010000", "P");
		key.put("01010001", "Q");
		key.put("01010010", "R");
		key.put("01010011", "S");
		key.put("01010100", "T");
		key.put("01010101", "U");
		key.put("01010110", "V");
		key.put("01010111", "W");
		key.put("01011000", "X");
		key.put("01011001", "Y");
		key.put("01011010", "Z");
		key.put("01011011", "[");
		key.put("01011100", "\\");
		key.put("01011101", "]");
		key.put("01011110", "^");
		key.put("01011111", "_");
		key.put("01100000", "`");
		key.put("01100001", "a");
		key.put("01100010", "b");
		key.put("01100011", "c");
		key.put("01100100", "d");
		key.put("01100101", "e");
		key.put("01100110", "f");
		key.put("01100111", "g");
		key.put("01101000", "h");
		key.put("01101001", "i");
		key.put("01101010", "j");
		key.put("01101011", "k");
		key.put("01101100", "l");
		key.put("01101101", "m");
		key.put("01101110", "n");
		key.put("01101111", "o");
		key.put("01110000", "p");
		key.put("01110001", "q");
		key.put("01110010", "r");
		key.put("01110011", "s");
		key.put("01110100", "t");
		key.put("01110101", "u");
		key.put("01110110", "v");
		key.put("01110111", "w");
		key.put("01111000", "x");
		key.put("01111001", "y");
		key.put("01111010", "z");
		key.put("01111011", "{");
		key.put("01111100", "|");
		key.put("01111101", "}");
		key.put("01111110", "~");
	}
	
	public Object getKey(String valueOfKey) {
		
		for(Object k : key.entrySet()) {
			Map.Entry<String, String> entry = (Entry<String, String>) k;
			if(entry.getKey().equals(valueOfKey)) {
				return entry.getValue();
			}
		}
		
		return null;
	}
}
