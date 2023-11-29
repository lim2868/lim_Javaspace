package com.kh.sec_06objectmethod;

/*Object 클래스의 equals(.) 메서드*/

class A1 {
	String name;

	A1(String name) {
		this.name = name;
	}
}

class B1 {
	String name;

	B1(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B1) obj).name) {
			return true;
		} else
			return false;
	}
}

public class Equals {

	public static void main(String[] args) {

		A1 a1 = new A1("안녕");
		A1 a2 = new A1("안녕");

		System.out.println(a1 == a2); // false
		System.out.println(a1.equals(a2));// false

		B1 b1 = new B1("안녕");
		B1 b2 = new B1("안녕");

		System.out.println(b1 == b2); // false
		System.out.println(b1.equals(b2));// true
	}

}
