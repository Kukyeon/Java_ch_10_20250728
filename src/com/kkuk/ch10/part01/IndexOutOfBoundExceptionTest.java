package com.kkuk.ch10.part01;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int[] arr = {10,20,30,40};
	//System.out.println(arr[4]);
	// 배열요소가 4개이므로 인덱스는 3까지만 존재 (에러)
	
	
	List<String> list = new ArrayList<String>(); // 인터페이스 이기때문에 arraylist라는 객체를 만들어 대입
	list.add("korea"); // 같은 index여서 숫자 0,1순으로 시작
	list.add("japan");  // 리스트에 요소 넣기
	
	list.get(1); // 리스트에 있는 요소 가져오기
	
	//System.out.println(list.get(2));
	// 존재하지 않는 인덱스 2에 접근하려 했으므로 IndexOutOfBoundException 에러 발생
	// 0 입력시 korea , 1입력시 japan 출력
}
}