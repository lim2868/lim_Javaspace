package com.kh.sec_02typecasting;

/*캐스팅의 가능여부를 확인할 수 있는 instanceof*/

class A2 {
}

class B2 extends A2 {
}

public class Typecasting_3 {

	public static void main(String[] args) {

		// #1. instanceof
		A2 aa = new A2();
		A2 ab = new B2();

		System.out.println(aa instanceof A2); // true
		System.out.println(ab instanceof A2); // true

		System.out.println(aa instanceof B2); // false
		System.out.println(ab instanceof B2); // true

		if (aa instanceof B2) {
			B2 b = (B2) aa;
			System.out.println("aa를 B로 캐스팅하였습니다.");
		} else {
			System.out.println("aa는 B 타입으로 캐스팅이 불가!!!");
		}
		if (ab instanceof B2) {
			B2 b = (B2) ab;
			System.out.println("ab를 B로 캐스팅하였습니다.");
		} else {
			System.out.println("ab는 B 타입으로 캐스팅이 불가!!!");
		}
		if ("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스입니다");
		}
	}
}
