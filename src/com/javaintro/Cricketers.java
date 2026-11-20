package com.javaintro;

public class Cricketers {
	// declaration
	// here countryid and country name is unique for every indian cricketer so i choose static
static int Country_id = 91;
static String Country_name ="INDIA";

// instance variable declaration

int Jersy_Number;
String Cricketer_Name;

	public static void main(String[] args) {
// here we can create object for instance class because we cannot access instance variables in static method
// name and jersy number for cricketer is specific so i choose instance
		
		Cricketers msd=new Cricketers();
		msd.Jersy_Number = 7;
		msd.Cricketer_Name= "MS Dhoni";
		System.out.println("Country_id :"+ Country_id);
		System.out.println("Country_name :"+ Country_name);
		System.out.println("Jersy_Number:"+ msd.Jersy_Number);
		System.out.println("Cricketer_Name:"+ msd.Cricketer_Name);
		
		Cricketers vrt =new Cricketers();
		vrt.Jersy_Number = 18;
		vrt.Cricketer_Name= "Virat Kohli";
		System.out.println("Country_id :"+ Country_id);
		System.out.println("Country_name :"+ Country_name);
		System.out.println("Jersy_Number:"+ vrt.Jersy_Number);
		System.out.println("Cricketer_Name:"+ vrt.Cricketer_Name);
		
		Cricketers rht =new Cricketers();
		rht.Jersy_Number = 45;
		rht.Cricketer_Name= "Rohith Sharma";
		System.out.println("Jersy_Number:"+ rht.Jersy_Number);
		System.out.println("Cricketer_Name:"+ rht.Cricketer_Name);
		
		Cricketers hard=new Cricketers();
		hard.Jersy_Number = 33;
		hard.Cricketer_Name= "Hardik Pandya";
		System.out.println("Jersy_Number:"+ hard.Jersy_Number);
		System.out.println("Cricketer_Name:"+ hard.Cricketer_Name);
		
		Cricketers sur=new Cricketers();
		sur.Jersy_Number = 63;
		sur.Cricketer_Name= "SuryaKumar";
		System.out.println("Jersy_Number:"+ sur.Jersy_Number);
		System.out.println("Cricketer_Name:"+ sur.Cricketer_Name);
		
		
	}

}
