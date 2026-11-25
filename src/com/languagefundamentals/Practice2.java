package com.languagefundamentals;

public class Practice2 {
	
	int a=20;
	int b=5;
	
	void add() {
		System.out.println("add:"+a+b);
		sub();
	}
	void sub() {
		System.out.println("sub:"+(a-b));
		mul();
	}
	
	 void mul() {
		 System.out.println("mul:"+a*b);
	
		div();
	}
	
	void div() {
		
		System.out.println("div:"+a/b);
		
	}
	


	public static void main(String[] args) {
Practice2 p = new Practice2();
p.add();
	}

}
