package com.languagefundamentals;

public class Student1 {
	
	String name="Sirisha";
	int marks1 =80;
	int marks2 = 50;
	int marks3 =60;
	int total;
	int average;
	
	static {
		System.out.println("Student Result Program");
	}
	
	{
		System.out.println("Student object created");
	}
	void calculateTotal() {
		
		total=marks1+marks2+marks3;
		
		calculateAverage();
	}
	
	void calculateAverage() {
		
		average=(marks1+marks2+marks3)/3;
		displayResult();
	
	}
	
	void displayResult() {
		System.out.println("name:"+name);
		
		System.out.println("total:"+total);
		System.out.println("average:"+average);
	}

	public static void main(String[] args) {

		Student1 s = new Student1();
		s.calculateTotal();
	}

}
