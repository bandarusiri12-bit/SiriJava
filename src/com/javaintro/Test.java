package com.javaintro;

public class Test {

	int x=10;
	void method1() {
		int a =20;
		method2();
	}
	
	void method2() {
		int b =30;
		System.out.println(b);
	}
	public static void main(String[] args) {
Test t = new Test();
int c =40;
t.method1();
t=null;
	}

}
