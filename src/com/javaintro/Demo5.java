package com.javaintro;

public class Demo5 {
	static int x; // static variable
	
	
	
	
	public static void main(String[] args) {
		//in static we cannot access instance directly so we created object

		Demo5 a = new Demo5();
		Demo5  b= new Demo5();
		Demo5  c= new Demo5();

		System.out.println("A count:"+ b.x);


	}
	
	// instance block
	{
		x=x+1;
	}
M
}
