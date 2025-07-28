package ex_20250728;

import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		
		try {
			
			System.out.println("문자열 입력");
			String input = scanner.nextLine();
			
			if(input == null) {
				System.out.println("문자열 입력");
			} else {
				System.out.println("문자열의 길이: " + input.length());
			}
				
		} catch(Exception e) {
			System.out.println("오류발생");
		}finally {
			scanner.close();
		}
		
		
		
		
		
	}

}
