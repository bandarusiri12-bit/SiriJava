package com.javaintro;

public class Demo8 {
	static
	Demo8 d1=new Demo8();


	String name;
int Rollno;
int batch;
String  Mobile;
String Collegename;

static void Method1() {
	d1.name="Sirisha";
	d1.Rollno=1;
	d1.batch=81;
	d1.Mobile="7702873889";
	d1.Collegename="ABCD";
d1.Method2();

}
void Method2() {
	
	System.out.println("name:"+d1.name);
	System.out.println("Rollno:"+d1.Rollno);
	
}
	public static void main(String[] args) {
		Method1();
	}

}
