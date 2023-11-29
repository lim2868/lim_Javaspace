package com.kh.basic_syntax;

public class ConsoleOutput {
	
	public static void main(String[] ar) {
		
		// System.out.println(...) 출력 후 줄 바꿈
		 
		System.out.println("안녕하세요");
		System.out.println("안녕" + "하세요");
		System.out.println(2 + 4);
		System.out.println(4.6);
		System.out.println("문자" + 1);
		System.out.println("문자" + 1 + 2);
		System.out.println(1 + 2 + "문자");
		System.out.println();
		
		// 숫자 + 문자 = 문자,   숫자 + 숫자 = 숫자, 문자 + 문자 = 문자
		
		int a = 5;
		String b = "하세요";
		System.out.println(a);
		System.out.println(b);
		System.out.println("안녕"+b);
		System.out.println(a + "안녕" + b);
		System.out.println();
		
		// System.out.print(...) 줄 바꿈 없이 한줄로 출력
		
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print("7");
		System.out.print("\n");
		System.out.print("\n");
		
		// System.out.printf("출력 서식, 출력할 내용) 서식이 있는 출력 */
		
		System.out.printf("%d\n", 10);
		System.out.printf("%o\n", 10);
		System.out.printf("%x\n", 10);
		System.out.printf("%s\n", "문자열 출력");
		System.out.printf("%f\n", 3.2582);
		System.out.printf("%4.2f\n", 3.2582);
		System.out.printf("%d와 %4.2f\n", 10, 3.2582);
		
	/* \n (println이랑 같다)
	 * %c 한글자(Charater)
	 * %s 문자열(String)
	 * %f 소수점으로 표현한 실수
	 * %.2f 소수점 2번째짜리까지 표시하고 반올림
	 * %d 10진수 표현
	 * %o 8진수 표현
	 * %x 16진수 표현
	 */
					
	}
}
