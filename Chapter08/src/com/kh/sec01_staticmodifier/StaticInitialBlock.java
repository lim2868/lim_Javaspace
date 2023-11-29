package com.kh.sec01_staticmodifier;

/*정적 초기화 블록*/

class D{
	int a;
	static int b;	
	static {
		b=5; // static 필드의 초기화는 static {} 내에서 수행
		System.out.println("클래스 A가 로딩되었습니다!!");
	}	
	D() {
		a=3; // 인스턴스 필드 초기화는 생성자에서 일반적으로 수행
		//b=5;
	}
}
public class StaticInitialBlock {

	public static void main(String[] args) {
		
		System.out.println(D.b); //5	
		D d = new D();
		System.out.println(d.a);
	}
}
