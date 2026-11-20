package com.javaintro;

public class Methods {

	public static void main(String[] args) {
System.out.println("main method started");
 method1();
	}
	
	static void method1() {
		method2();
		method3();
		System.out.println("method1 started");
	}
static void  method2() {
	
	System.out.println("Method2 started");
}

static void method3() {
	System.out.println("Method3 started");
}
}
