package com.kh.sec03_anonymousclass;

/*클래스 미정의 및 참조변수명을 사용/미사용의 경우 매개변수 객체 전달*/

interface A3 {
	public abstract void abc();
}

class C3 {
	void cde(A3 a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {

		C3 c = new C3();
		// #3. 방법#3 클래스명 X + 참조변수명 O
		A3 a = new A3() {
			public void abc() {
				System.out.println("매개변수 전달");
			}
		};
		c.cde(a); // 매개변수 전달
		// #4. 방법#4 클래스명 X + 참조변수명 X
		c.cde(new A3() {
			public void abc() {
				System.out.println("매개변수 전달");
			}
		}); // 매개변수 전달
	}
}
