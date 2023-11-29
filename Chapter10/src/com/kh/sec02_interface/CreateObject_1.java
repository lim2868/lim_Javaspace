package com.kh.sec02_interface;

/*자식클래스의 직접 정의를 통한 인터페이스타입의 객체 생성 (방법#1)*/

interface A3 {
	int a = 3;

	void abc();
}

class B3 implements A3 {
	public void abc() {
		System.out.println("방법#1. 자식클래스 생성자로 객체 생성");
	}
}

public class CreateObject_1 {

	public static void main(String[] args) {

		// #1. 객체 생성
		A3 b1 = new B3();
		A3 b2 = new B3();

		// #2. 메서드 호출
		b1.abc();
		b2.abc();
	}
}
