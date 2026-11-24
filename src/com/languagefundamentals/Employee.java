package com.languagefundamentals;

public class Employee {

	static int Employee_id;
	String Emoloyee_name;
	Long Mobile_num;
	String Dept_name;
	double basesalary;
	float totalsalary;
	int age;
	Boolean active;
	char gender;
	float bounce;
	
	void Method1() {
		Employee_id=Employee_id+1;
		Emoloyee_name="Sirisha";
		Mobile_num=7702873889L;
		Dept_name="Accounting";
		basesalary=3000.0;
		age=23;
		active=true;
		gender='F';
		bounce=500;
		Method2();
	
		
		Employee_id=Employee_id+1;
		Emoloyee_name="Suma";
		Mobile_num=6602873889L;
		Dept_name="Finance";
		basesalary=2500.0;
		age=24;
		active=true;
		gender='F';
		bounce=100;
		Method2();
		

		Employee_id=Employee_id+1;
		Emoloyee_name="Mamatha";
		Mobile_num=5502873889L;
		Dept_name="Marketing";
		basesalary=3500.0;
		age=21;
		active=false;
		gender='F';
		bounce=300;
Method2();

		
	}
	
	
	void Method2() {
		
		totalsalary= (float) (basesalary + bounce);
		display();
		
	}
	
	void display() {
		
		System.out.println("Employee_id:"+Employee_id);
		System.out.println("Employee_name:"+Emoloyee_name);
		System.out.println("Mobile_num:"+Mobile_num);
		System.out.println("Dept_name:"+Dept_name);
		System.out.println("age:"+age);
		System.out.println("active:"+active);
		System.out.println("gender:"+gender);
		System.out.println("bounce:"+bounce);
		System.out.println("basesalary:"+basesalary);
		System.out.println("totalsalary=basesalary+bounce:"+totalsalary);
		System.out.println();
		
		
		
	}
	public static void main(String[] args) {

		Employee e = new Employee();
		e.Method1();
		
		
	}

}
