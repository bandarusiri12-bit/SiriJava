package com.javaintro;

public class Demo6 {
	// static variable 
	static int a = 1;
static {
	System.out.println(a);

}
// instance variable

 int b=2;
 {
	 System.out.println(b);
 }

 // instance block
 {
	 System.out.println("instance block is execute");
 }
// static block
	static
	{
		System.out.println("Static block is executed");
	}
Demo6()
{
	System.out.println("Constructor is executed");
}

public static void main(String[]args) {
	System.out.println("Main method is started");
	Demo6 d = new Demo6();
	Demo6 d1 = new Demo6();
	}

}

