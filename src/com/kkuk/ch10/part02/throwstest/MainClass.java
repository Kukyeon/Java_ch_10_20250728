package com.kkuk.ch10.part02.throwstest;

import java.sql.Connection;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsSample throwsSample = new ThrowsSample();
		try {
			throwsSample.ZeroDivid();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			throwsSample.ZeroDivid();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("모든 수는 0으로 나눌 수 없습니다.,.,.");
//		} // by zero , 0나누기 에러 발새새생
		
		
		 System.out.println("=======출력중=======");
		 
		 
		 Connection conn = null;
		 DbTest dbTest = new DbTest();
		 try {
			 conn = dbTest.conn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			 try {
				 conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

}
}
