package com.kh.sec02_interface;

/*인터페이스와 클래스의 상속 키워드 */

interface A1 {
}

interface B1 {
}

//#1. 단일인터페이스 상속
class C1 implements A1 {
}

//#2. 다중인터페이스 상속
class D1 implements A1, B1 {
}

//#3. 클래스와 인터페이스를 한번에 상속 (extends와 implements의 순서는 변경 불가)
class E1 extends C1 implements A1, B1 {

}

public class Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
