package com.kh.sec02_interface;

/*자식클래스에서 부모인터페이스의 디폴트메서드 호출*/

interface A6 {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B6 implements A6 {
	public void abc() {
		A6.super.abc(); // super.abc() 이건 부모클래스의 abc() 메서드 호출하란 소리
		System.out.println("B 클래스의 abc()");
	}
}

public class DefaultMethod_2 {

	public static void main(String[] args) {
		// #1. 객체생성
		B6 b = new B6();

		// #2. 메서드 호출
		b.abc(); // A 인터페이스의 abc() B 클래스의 abc()
	}
}
