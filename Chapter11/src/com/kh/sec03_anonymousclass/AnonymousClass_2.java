package com.kh.sec03_anonymousclass;
/*익명이너클래스를 활용하여 인터페이스 객체 생성*/

class A1 {
	C1 c = new C1() {
		public void bcd() {
			System.out.println("익명이너클래스");
		}
	};

	void abc() {
		c.bcd();
	}
}

interface C1 {
	public abstract void bcd();
}

public class AnonymousClass_2 {

	public static void main(String[] args) {

		// #1. 객체 생성 및 메서드 호출
		A1 a1 = new A1();
		a1.abc(); // 익명이너클래스
	}
}
