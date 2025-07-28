package com.kkuk.ch10.part02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader reader = new FileReader("asas.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
