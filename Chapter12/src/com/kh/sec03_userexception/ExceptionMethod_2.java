package com.kh.sec03_userexception;

class A1 {
	void abc() throws NumberFormatException {
		bcd();
	}

	void bcd() throws NumberFormatException {
		cde();
	}

	void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");
	}
}

public class ExceptionMethod_2 {

	public static void main(String[] args) {

		// #1. 객체 생성
		A1 a = new A1();
		// #2. 메서드 호출 / 예외처리
		try {
			a.abc();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
