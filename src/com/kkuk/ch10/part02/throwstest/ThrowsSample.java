package com.kkuk.ch10.part02.throwstest;

public class ThrowsSample {
	
	public void ZeroDivid() throws Exception {
	// 메소드를 호출하는 쪽에서 예외 처리를 하라고 강제하는 구문 throws <- 임	
		
		System.out.println(10/0);
		
	}
}
