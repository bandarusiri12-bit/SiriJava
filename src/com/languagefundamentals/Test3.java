package com.languagefundamentals;

public class Test3 {

	static int x=10;
	int y =20;
	
	static void Method1() {
		Test3 t=new Test3();
		
	x=50;
	t.y=100;
	t.display();
	
	Test3 t1=new Test3();
	t1.display();
	
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
		
	}
	
	public static void main(String[] args) {
		
		Method1();

	}

}
