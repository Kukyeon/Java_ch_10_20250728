package com.kkuk.ch10.part02;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		
		
		try {
			int result = 100 / num;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("모든 수는 0으로 나눌 수 없습니다. num값을 다시 확인하세요..");
		}
		
		System.out.println(" 정삭적으로 출력중 ");
		
		
		
	}

}
