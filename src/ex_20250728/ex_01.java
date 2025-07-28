package ex_20250728;

import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner(System.in);
	
		try {
			
			System.out.println("첫번째 숫자 입력");
			int num1 = Integer.parseInt(scanner.nextLine());
			
			System.out.println("두번째 숫자 입력");
			int num2 = Integer.parseInt(scanner.nextLine());
			
			if (num2 == 0) {
				System.out.println("0으로 나눌수 없다");
			} else {
				int result = num1 / num2;
                System.out.println("결과값 : " + result);
}
			} catch(Exception e) {
				System.out.println(" 값을 확인 해주세요 ");
			} finally {
				scanner.close();
			}
		}
	
}
