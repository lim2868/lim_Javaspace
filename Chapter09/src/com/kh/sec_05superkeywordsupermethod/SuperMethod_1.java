package com.kh.sec_05superkeywordsupermethod;

/*super() 메서드의 기능 및 컴파일러에 의한 자동추가 super()*/

class A2 {
	A2() {
		System.out.println("A 생성자");
	}
}

class B2 extends A2 {
	B2() {
		super(); // 생략시 컴파일러가 자동 추가 (부모클래스의 생성자 호출)
		System.out.println("B 생성자");
	}
}

class C2 {
	C2(int a) {
		System.out.println("C 생성자");
	}
}

class D2 extends C2 {
	/*
	 * 컴파일러가 자동으로 추가해주는 내용 D(){ super(); }
	 */
	D2() {
		super(3);
	}
}

public class SuperMethod_1 {

	public static void main(String[] args) {

		// #1. A 객체 생성
		A2 aa = new A2();
		System.out.println(); // A 생성자

		// #2. B 객체 생성
		B2 bb = new B2(); // A 생성자 -> B 생성자
	}
}
