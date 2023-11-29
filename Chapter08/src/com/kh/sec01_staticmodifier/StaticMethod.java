package com.kh.sec01_staticmodifier;

class C {
	void abc() { //인스턴스 메서드
		System.out.println("instance 메서드");
	}
	static void bcd() { //정적메서드
		System.out.println("static 메서드");
	}
}
public class StaticMethod {

	public static void main(String[] args) {

		//#1. 인스턴스 메서드 활용방법 (객체생성 후에만 사용가능)
				C c1 = new C();
				c1.abc(); //instance 메서드
				
				//#2. 정적 메서드 활용방법 
				//@방법1. 클래스 이름으로 바로 접근하여 사용
				C.bcd(); //static 메서드
				//@방법2. 객체생성후에도 사용가능 : 가능한 지양
				C c2 = new C();
				c2.bcd(); //static 메서드		
	}
}
