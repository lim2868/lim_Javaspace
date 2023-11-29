package com.kh.sec01_method;

import java.util.Arrays;

/*배열 매개변수를 가지는 메서드 호출*/

public class ArrayArgumentMethod {
	
		public static void main(String[] args) {		
			//배열을 매개변수로 가지는 메서드 호출
			int[] a = new int[] {1,2,3};
			int[][] b = new int [][] {{1,2,3},{4,5,6}};
			
			twise(b);
			printArray(a);
			printArray(new int[] {1,2,3});		
//			printArray({1,2,3})		
		}	
		public static void printArray(int[] a) {
			System.out.println(Arrays.toString(a));
		}
		
		public static void twise(int [][] b) {
			for(int[] i : b)
			System.out.println(Arrays.toString(i));
//			for(int[] i: b) {
//				for(int k : i) {
//					System.out.print(Arrays.toString());
//		}
//				System.out.println();
//		}
	}
}
