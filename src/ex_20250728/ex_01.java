package ex_20250728;

import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner(System.in);
	
		System.out.println("첫번째 숫자 입력");
		int a = scanner.nextInt();
		System.out.println("두번째 숫자 입력");
		int b = scanner.nextInt();
		int result;
	
		try {
			result = a / b;
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("0으로 나눌수없습니다.");
		}
		scanner.close();
	}
	
	
}
