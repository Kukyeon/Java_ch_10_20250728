package com.kkuk.ch10.part02;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {10, 20, 30};
		
		try {
			for(int i = 0 ; i <= 3 ; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("arr[3] 은 없는 인덱스입니당");
			
		} finally {
			System.out.println(" 저는 에러가 나던 안나던 그냥 실행 됩니다.ㅡ,, ");
		}
		
		
		
		System.out.println(" 이후 잘 출력중 ");
		
	}

}
