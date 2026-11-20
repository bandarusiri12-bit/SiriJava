package com.javaintro;

public class Demo2 {
// static variable declaration
	
		static int Student_id;
		static String Student_name;
		
		// instance variable declaration
		
		int Institute_id;
		  String Institute_name;
		
		public static void main(String[] args) {
			System.out.println("Hello world");
			
		
			// staic variable initialization

			Student_id = 201;
			Student_name="Sirisha";
			// Representation 
			// we can access static members diectly 
			
			 System.out.println("Student_id:"+Student_id);
			System.out.println("Student_name:"+Student_name);
			
//we can access static members by using classname with out creating an object
			
			System.out.println("Student_id:"+Demo2.Student_id);
			System.out.println("Student_name:"+Demo2.Student_name);

// static variable representation ..
			// Cannot make a static reference to the non-static field Institute_id
			//we cannot access instance varibales when main method is static,so we must create an object
			
	
			Demo2 	D1=new Demo2();
			D1.Institute_id = 301;
			D1. Institute_name ="Vcube";
		
			System.out.println("Institute_id:"+ D1.Institute_id);
			System.out.println("Institute_name:"+D1.Institute_name);
			
	}

}
