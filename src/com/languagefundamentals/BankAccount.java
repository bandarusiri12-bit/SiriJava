package com.languagefundamentals;

public class BankAccount {
static int Account_number;
String HolderName;
 long Mobilenumber;
 String IFSCcode;
 float Balance;

  void Method1() {
	 
	 
	  Account_number=1234;
	  HolderName="Sirisha";
	  Mobilenumber= 7702873889L;
	  IFSCcode="IF1234568";
	  Balance= 300.00F;
	 Method2();
	  
	  Account_number=Account_number+1;
	  HolderName="Suma";
	  Mobilenumber= 77028738789L;
	  IFSCcode="IF666668";
	  Balance= 400.00F;
	 Method2();
	 
}

 void  Method2() {


	System.out.println("Account_number:"+Account_number);
	System.out.println("HolderName:"+HolderName);
	
}
	public static void main(String[] args) {
		
		BankAccount a = new BankAccount();
		 BankAccount b = new BankAccount();
a.Method1();

	}

}
