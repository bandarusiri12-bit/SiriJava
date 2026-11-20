package com.javaintro;

public class Instance {

	{
		System.out.println("Instance block1");
	}
	
	{
		System.out.println("Instance block2");

	}
	{
		System.out.println("Instance block3");

	}
	
	Instance(){
		System.out.println("Constructor body");
		System.out.println("------------------------");

		
	}
	
	public static void main(String[] args) {
Instance a= new Instance();
Instance b= new Instance();
Instance c= new Instance();


	}

}
