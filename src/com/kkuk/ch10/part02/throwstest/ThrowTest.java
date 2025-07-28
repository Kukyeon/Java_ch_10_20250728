package com.kkuk.ch10.part02.throwstest;

public class ThrowTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = -10;
		if(age < 0) {
			throw new IllegalArgumentException("나이는 음수가 올 수 없슴다"); // 강제 예외 발생시키기
			//System.out.println("나이는 음수가 올 수 없슴다");
		}
		
		try {
			throw new ArithmeticException("모든 수는 0으로 나눌 수 없다요");
		} catch (Exception e) {
			
		}
		
		
		System.out.println("=====이어서 출력중=====");
}
}