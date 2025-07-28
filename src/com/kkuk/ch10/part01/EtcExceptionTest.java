package com.kkuk.ch10.part01;

import java.io.FileReader;

public class EtcExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 나누기 에러
		int num = 0;
		int a = 1 / num; // 에러는 안나지만 출력불가 ArithmeticException 
		
		
		// FileNotFoundException
		//FileReader reader = new FileReader("파일이름");
		// 외부 파일을 불러오는 명령문은 파일이 존재하지 않을 가능성이 존재함으로
		// 반드시 예외처리 구문으로만 구현 가능함
	}

}
