package com.kh.sec_01.abstractclass;

/*추상클래스를 상속하여 오버라이딩 수행*/

abstract class Animal1 {
	abstract void cry();
}

class Cat1 extends Animal1 {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog1 extends Animal1 {
	void cry() {
		System.out.println("멍멍");
	}
}

public class Abstract_2 {

	public static void main(String[] args) {

		// #1. 객체생성
		Animal1 animal1 = new Cat1();
		Animal1 animal2 = new Dog1();

		// #2. 메서드 호출
		animal1.cry(); // 야옹
		animal2.cry(); // 멍멍
	}

}
