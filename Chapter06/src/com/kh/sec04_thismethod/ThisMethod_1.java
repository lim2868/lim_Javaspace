package com.kh.sec04_thismethod;

/*this(생성자의 매개변수) 메서드의 문법적 특징과 의미*/

//#1. 클래스의 정의
class C {
	C() {
		System.out.println("첫번째 생성자");
	}
	C(int c){
		this(); //생성자의 첫줄에만 올 수 있다. 
		System.out.println("두번째 생성자");
	}
	/* 메서드에서는 this() 메서드 사용 불가 
	void abc() {
		this(); //불가능
	}
  */
}

public class ThisMethod_1 {

	public static void main(String[] args) {
		
			//#2. 객체 생성
			C c1 = new C(); //첫번째 생성자
			System.out.println();
			C c2 = new C(3);// 첫번째 생성자 -> 두번째 생성자	
	}
}
