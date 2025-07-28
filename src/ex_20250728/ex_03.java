package ex_20250728;

import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		
		try {
			System.out.println(" 정수를 입력해주세요 : ");
			String input = scanner.nextLine();
			
			if (input.contains("0.1")) {
				System.out.println(" 정수가 아닙니다. ");
				return;
			}
			
			int number = Integer.parseInt(input);	
			
			if (number % 2 == 0) {
				System.out.println(" 정수 ");
			} else {
				System.out.println(" 홀수 ");
			}
		} catch(Exception e) {
			System.out.println(" 정수가 아닙니다. ");
		}finally {
			scanner.close();
		}
		
		
}
}