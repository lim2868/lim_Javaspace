package com.kh.sec02_interface;

/*인터페이스내의 정적(staic) 메서드*/

interface A7 {
	static void abc() {
		System.out.println("A 인터페이스의 정적 메서드 abc()");
	}
}

public class StaticMethod {

	public static void main(String[] args) {

		// #1.정적메서드 호출
		A7.abc();
	}
}