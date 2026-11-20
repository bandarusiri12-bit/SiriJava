package com.javaintro;

public class Practice2 {

	int Employee_ID;
	String Employee_Name;
	int Salary;
	String Department;
	public static void main(String[] args) {
		Practice2 e1=new Practice2();
	
e1.Method1();

	}
void Method1() {
	Employee_ID=201;
	Employee_Name="Sirisha";
	Salary=3000;
	Department="CSE";
	Method3();
	Method2();
	
}

void Method2() {
	System.out.println("Employee_ID:"+Employee_ID);
	System.out.println("Employee_Name:"+Employee_Name);
	System.out.println("Salary:"+Salary);
	System.out.println("Department:"+Department);



	
}
static void Method3() {
	System.out.println("welcome to Employement Management");

}
}
