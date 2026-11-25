package com.languagefundamentals;

public class Practice4 {
  int a =15;
  int b=4;
  
  void remainder() {
	  
	  System.out.println("remainder:"+a%b);
  }
  
  void doubleA() {
	  System.out.println("doubleA:"+a*2);
  }
  
  void sum() {
	  
	  System.out.println("sum:"+(a+b));
  }
	public static void main(String[] args) {
		
		Practice4 p=new Practice4();
		p.remainder();
		p.doubleA();
		p.sum();

	}

}
