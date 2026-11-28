package com.languagefundamentals;

public class DataTypes {

	String studentname="Sirisha";
	double marks =99.9;
	int totalmarks = 100;
	// converting marks from double to int using explicit type casting
	
	int submarks=(int)marks;
	
	// converting the total marks from int to double using automatic type casting
	
	double stutotalmarks=totalmarks;
	
	//calculate the percentage
	
	double percentage=(marks/totalmarks)*100;
	public static void main(String[] args) {
		
		DataTypes d = new DataTypes();
		
		System.out.println("studentname:"+d.studentname);
		
		System.out.println("original marks:"+d.marks);
		System.out.println("rounded marks:"+d.submarks);
		System.out.println("totalmarks:"+d.totalmarks);
		System.out.println("percentage:"+d.percentage);
	}

}
