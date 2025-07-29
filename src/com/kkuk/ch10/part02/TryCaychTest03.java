package com.kkuk.ch10.part02;

import java.util.Scanner;

public class TryCaychTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		
		//scanner.nextLine(); // 문자열을 입력받음 정수는 nextint
		String str = scanner.nextLine();
		
		
		if(str.length() == 0 ) {
			throw new IllegalArgumentException(" 문자열이 공란이다 ");
		} else {
			System.out.println(str.length());
		}
			scanner.close();
		
		
		
		
		
	}

}
