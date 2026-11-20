package com.javaintro;

public class TestDemo1 {

	// declaration
	
	static int a;
	
	// static block
	
	static {
		System.out.println("This is the first statement");
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is the second statement");
		System.out.println("A values is:"+a);

	}
	static
	{
		System.out.println("This is the third statement");

	}

}
  // if we dont initialize any thing it will give int for 0,and string for null value