package com.languagefundamentals;

public class Product {
	
	static int Product_id;
	String Product_name;
	Long Mobile_number;
	String Category_name;
	float Base_price;
	float Total_price;
	double TaxAmount;
	
	
	void method1() {
		
		Product_id = 111;
		Product_name="Sirisha";
		Mobile_number=7702873889L;
		Category_name="APPLE";
		Base_price=1000.00F;
		TaxAmount=500.00F;
		method2();
		
		Product_id = Product_id+1;
		Product_name="Samantha";
		Mobile_number=552873889L;
		Category_name="ABCD";
		Base_price=2000.00F;
		TaxAmount=500.00F;
		method2();
		
	}

	
	void method2() {
		
		Total_price=(float)(Base_price+TaxAmount);
		display();
	}
	
	void display() {
		
		
		System.out.println("Product_id:"+Product_id);
		System.out.println("Product_name:"+Product_name);
		System.out.println("Mobile_number:"+Mobile_number);
		System.out.println("Category_name:"+Category_name);
		System.out.println("Base_price:"+Base_price);
		System.out.println("TaxAmount:"+TaxAmount);
		System.out.println("Total_price=:"+Total_price);
		System.out.println();
	
	}
	public static void main(String[] args) {

		Product p = new Product();
		p.method1();
	}

}
