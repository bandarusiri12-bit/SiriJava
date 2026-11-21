package com.javaintro;

public class Demo9 {
// static block
	
	static {
		System.out.println("Static block");
	}
	// instance block
	{
		System.out.println("Instance block");


	}
	// constructor body
Demo9(){
	
	System.out.println("Constructor body");

}
	public static void main(String[] args) {
		
		Demo9 d = new Demo9();
		Demo9 d1=new Demo9();

	}

}
