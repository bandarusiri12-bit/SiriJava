package com.javaintro;

public class Demo4 {
	

static void method5() {
	System.out.println("Method 5 is started");
	Demo4 t = new Demo4();
	t.method4();
	method6();
}
static void method6() {
	System.out.println("Method6 is started");
	method3();
	
}

public static void main(String[]args) {
	System.out.println(" Main Method is started");
	method5();

}
void method4() {
	System.out.println("Method 4 is started");
}
	void method2() {
		System.out.println("Method 2 is started");

	}

static void method3() {
	System.out.println("Method 3 is started");
	Demo4 p = new Demo4();
	p.method2();
}
}

