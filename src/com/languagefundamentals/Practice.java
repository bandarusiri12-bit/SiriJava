package com.languagefundamentals;

public class Practice {

	
	int a=10;
	int b=20;
	
	void method1() {
		
		a=a+b;
		method2();
	}
	
	void method2() {
		
		b=a-b;
		display();
	}
	
	void display() {
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
	public static void main(String[] args) {
		Practice p=new Practice();
		p.method1();

	}

}
