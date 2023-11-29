package com.kh.sec_05superkeywordsupermethod;

/*this()메서드와 super() 메서드의 혼용*/

class A3 {
	A3() {
		this(3);
		System.out.println("A 생성자 1");
	}

	A3(int a) {
		System.out.println("A 생성자 2");
	}
}

class B3 extends A3 {
	B3() {
		this(3);
		System.out.println("B 생성자 1");
	}

	B3(int a) {
		System.out.println("B 생성자 2");
	}
}

public class SuperMethod_2 {

	public static void main(String[] args) {

		// #1. A 객체 생성
		A3 aa1 = new A3(); // A 생성자 2 A 생성자 1
		System.out.println();
		A3 aa2 = new A3(3); // A 생성자 2
		System.out.println();

		// #2. B 객체 생성
		B3 bb1 = new B3(); // A 생성자 2 A 생성자 1 B 생성자 2 B 생성자 1
		System.out.println();
		B3 bb2 = new B3(3);// A 생성자 2 A 생성자 1 B 생성자 2
	}

}
