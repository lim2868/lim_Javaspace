package com.kh.sec03_methodoverriding;

/*메서드 오버라이딩 vs. 메서드 오버로딩*/

class C {
	void print1() {
		System.out.println("A 클래스 print1");
	}

	void print2() {
		System.out.println("A 클래스 print2");
	}
}

class D extends C {
	@Override
	void print1() {
		System.out.println("B 클래스 print1");
	}

	void print2(int a) {
		System.out.println("B 클래스 print2");
	}
}

public class MethodOverriding_3 {

	public static void main(String[] args) {

		// #1. A 타입 선언 / A 생성자 사용
		C cc = new C();
		cc.print1(); // A 클래스 print1
		cc.print2(); // A 클래스 print2
		System.out.println();

		// #2. B 타입 선언 / B 생성자 사용
		D dd = new D();
		dd.print1(); // B 클래스 print1
		dd.print2(); // A 클래스 print2
		dd.print2(3);// B 클래스 print2
		System.out.println();

		// #3. A 타입 선언 / B 생성자 사용
		C cd = new D();
		cd.print1(); // B 클래스 print1
		cd.print2(); // A 클래스 print2
	}
}
