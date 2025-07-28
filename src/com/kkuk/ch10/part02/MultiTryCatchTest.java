package com.kkuk.ch10.part02;

public class MultiTryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			try {
				int a = 10 / 0 ; // by zero 에러 /
				
				int [] arr = {1,2,3};
				System.out.println(arr[4]); // index out of bound 에러
				
			} catch (Exception e) {  // Exception 모든 에러를 다잡음 ㅎㅅㅎ
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		System.out.println("=== 여기는 출력중 ===");
		
		
		
	}

}
