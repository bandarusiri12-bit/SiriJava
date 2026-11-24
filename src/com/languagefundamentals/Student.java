package com.languagefundamentals;

public class Student {
	
	static int Studentid;
	String Studentname;
	int marks1;
	int marks2;
	int marks3;
	float totalmarks;
	float average;
	
	void method1() {
		Studentid=Studentid+1;
		Studentname="Sirisha";
		marks1=60;
		marks2=80;
		marks3=100;
		method2();
		
		Studentid=Studentid+1;
		Studentname="Anusha";
		marks1=70;
		marks2=100;
		marks3=100;
		method2();
		
		
	}
	
	void method2() {
		
		totalmarks=(float)(marks1+marks2+marks3);
		average=totalmarks/3;
		display();
		
	}
	
	void display() {
		
System.out.println("Studentid:"+Studentid);
System.out.println("Studentname:"+Studentname);
System.out.println("totalmarks:"+totalmarks);
System.out.println("average:"+average);
System.out.println();

	}
	
	

	public static void main(String[] args) {
		
		Student s = new Student();
		s.method1();

	}

}
