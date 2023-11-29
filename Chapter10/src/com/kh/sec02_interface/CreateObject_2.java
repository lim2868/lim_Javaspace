package com.kh.sec02_interface;

interface A4 {
	int a = 3;

	void abc();
}

public class CreateObject_2 {

	public static void main(String[] args) {

		// #1. 객체 생성
		A4 a1 = new A4() {
			public void abc() {
				System.out.println("방법2. 익명이너클래스를 이용한 객체 생성 ");
			}
		};
		A4 a2 = new A4() {
			public void abc() {
				System.out.println("방법2. 익명이너클래스를 이용한 객체 생성 ");
			}
		};
		// #2. 메서드 호출
		a1.abc();
		a2.abc();
	}

}
