package com.kh.sec02_consturtor;

/*다양한 생성자를 사용한 다양한 객체 생성 방법*/

class D {	
	D() {
		System.out.println("첫번째 생성자");
	}
	D(int a) {
		System.out.println("두번째 생성자");
	}
	D(int a, int b) {
		System.out.println("세번째 생성자");
	}
}
public class ConstructorOverloading {
	
	public static void main(String[] args) {		
		//#1. 세가지 생성자를 이용한 객체 생성
		D a1 = new D(); //첫번째 생성자
		D a2 = new D(3); //두번째 생성자
		D a3 = new D(3, 5); //세번째 생성자		
	}

}
