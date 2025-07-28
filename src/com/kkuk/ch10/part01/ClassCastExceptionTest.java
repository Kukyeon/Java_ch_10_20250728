package com.kkuk.ch10.part01;

public class ClassCastExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 오브젝트는 모든 클래스의 조상 왠만한 모든걸 받아줌( 업캐스팅 )
		Object ob = new String("korea"); // 업캐스팅
		
		Integer a = (Integer) ob; // 다운캐스팅 -> ClassCastException 에러발생
		
	}

}
