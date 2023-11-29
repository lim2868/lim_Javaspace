package com.kh.sec_06objectmethod;

/*Object 클래스의 hashCode() 메서드*/

import java.util.HashMap;

class A2 {
	String name;

	A2(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((A2) obj).name) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return name;
	}
}

class B2 {
	String name;

	B2(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B2) obj).name) {
			return true;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return name;
	}
}

public class Hashcode {

	public static void main(String[] args) {

		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println(hm1);

		HashMap<A2, String> hm2 = new HashMap<>();
		hm2.put(new A2("첫번째"), "데이터1");
		hm2.put(new A2("첫번째"), "데이터2");
		hm2.put(new A2("두번째"), "데이터3");
		System.out.println(hm2);

		HashMap<B2, String> hm3 = new HashMap<>();
		hm3.put(new B2("첫번째"), "데이터1");
		hm3.put(new B2("첫번째"), "데이터2");
		hm3.put(new B2("두번째"), "데이터3");
		System.out.println(hm3);
	}

}
