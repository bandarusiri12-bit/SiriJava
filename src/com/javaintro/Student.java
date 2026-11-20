package com.javaintro;

public class Student {
	
	// instance declaration(non-static)
	
	int Student_id;
	String Student_Name;

	public static void main(String[] args) {
System.out.println("welcome to student world");

// if we want to access instance we must create an object
//LHS;Student is a class and s1 is a reference of an object
//RHS; = is an operator and new is java keyword to create object by using constructor calling

Student s1  = new Student();
s1.Student_id=21420;
s1.Student_Name="Sirisha";
System.out.println("Student_id:"+ s1.Student_id);
System.out.println("Student_Name:"+s1.Student_Name);
	}

}
// 