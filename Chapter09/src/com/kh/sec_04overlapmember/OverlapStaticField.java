package com.kh.sec_04overlapmember;

/*정적 필드의 중복*/

class A1 {
	static int m = 3;
}

class B1 extends A1 {
	static int m = 4;
}

public class OverlapStaticField {

	public static void main(String[] args) {

		// #1.클래스 이름으로 바로 접근
		System.out.println(A1.m); // 3
		System.out.println(B1.m); // 4
		System.out.println();

		// #2.객체 생성
		A1 aa = new A1();
		B1 bb = new B1();
		A1 ab = new B1();

		// #3. 객체 생성을 통한 static field
		System.out.println(aa.m); // 3
		System.out.println(bb.m); // 4
		System.out.println(ab.m); // 3
	}

}
