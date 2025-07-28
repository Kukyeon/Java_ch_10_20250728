package ex_20250728;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ex_04 {

	public class ThrowsExample {
	    public static void readFile() throws Exception {
	        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
	        System.out.println(br.readLine());
	        br.close();
	    }
	
}
}