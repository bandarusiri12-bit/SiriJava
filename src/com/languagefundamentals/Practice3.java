package com.languagefundamentals;

public class Practice3 {

	int a =10;
	int b=20;
	
	void SquareofA() {
		System.out.println(a*a);
	 SquareofB();
		
	}
	
	void SquareofB() {
		
		System.out.println(b*b);
		average();
	}
	
	void average() {
		
		System.out.println((a+b)/2);
	}
	public static void main(String[] args) {
Practice3 p = new Practice3();
p.SquareofA();
		
	}

}
