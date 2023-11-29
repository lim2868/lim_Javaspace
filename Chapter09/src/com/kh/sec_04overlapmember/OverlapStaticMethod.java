package com.kh.sec_04overlapmember;

/*정적 메서드의 중복*/

class A2 {
	static void print() {
		System.out.println("A 클래스");
	}
}

class B2 extends A2 {
	static void print() {
		System.out.println("B 클래스");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {

		// #1. 클래스 이름으로 바로 접근
		A2.print(); // A 클래스
		B2.print(); // B 클래스
		System.out.println();

		// #2. 객체 생성
		A2 aa = new A2();
		B2 bb = new B2();
		A2 ab = new B2();

		// #3. 객체를 통한 메서드 호출
		aa.print(); // A 클래스
		bb.print(); // B 클래스
		ab.print(); // A 클래스
	}
}
