package com.languagefundamentals;

public class Test2 {
	
	static String Collegename;
	String Studentname;
 int Rollno;
	
	static void Method1() {
		
		Test2 t = new Test2();
		Collegename ="RGUKT";
		t.Studentname="Sirisha";
		t.Rollno = 1;
		
		t.display();
		
		
		Test2 t1 = new Test2();
		t1.Studentname="Suma";
		t1.Rollno = 2;
		t1.display();
		
	}
	
	void display() {
		
		System.out.println("Collegename:"+Collegename);
		System.out.println("Studentname:"+Studentname);
		System.out.println("Rollno:"+Rollno);
		
	}

	public static void main(String[] args) {

		Method1();
	}

}
