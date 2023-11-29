package com.kh.sec02_interface;

/*인터페이스 상속 자식클래스의 접근지정자*/

interface A2 {
	public abstract void abc();
}

interface B2 {
	void bcd(); // 생략시 public abstract
}

class C2 implements A2 {
	public void abc() {
		// ...
	}
}
/*
 * public -> default 불가능 class D implements B { void bcd() {
 * 
 * } }
 */

public class Inheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
