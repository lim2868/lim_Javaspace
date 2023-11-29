package com.kh.sec01_staticmodifier;

/*정적필드의 공유기능*/

class B {
	int m=3; //인스턴스 필드
	static int n=5; //정적(static) 필드
}
public class StaticField_2 {

	public static void main(String[] args) {

		B b1 = new B();
		B b2 = new B();
		
		//인스턴스 필드
		b1.m=5;
		b2.m=6; 		
		System.out.println(b1.m); //5
		System.out.println(b2.m); //6
		
		//정적필드
		b1.n=7;
		b2.n=8;		
		System.out.println(b1.n); //8
		System.out.println(b2.n); //8
		
		B.n=9;
		System.out.println(b1.n); //9
		System.out.println(b2.n); //9
	}

}
