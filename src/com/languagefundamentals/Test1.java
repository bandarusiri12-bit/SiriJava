package com.languagefundamentals;

public class Test1 {
	
static String Bankname;
static int Totalaccounts;
int account_num;
String Customername;
double balance;



static void Deposit() {
	
	
	Test1 t=new Test1();
	Bankname="SBI";
	Totalaccounts=Totalaccounts+1;
	t.account_num=1234567;
	t.Customername="B.Sirisha";
	t.balance=200.00;
	t.display();
	
	
	Test1 t1=new Test1();
	
	Totalaccounts=Totalaccounts+1;
	t1.account_num=123456789;
	t1.Customername="Lavanya";
	t1.balance=300.00;
	t1.display();
}

void display() {
	System.out.println("Bankname:"+Bankname);
	System.out.println("Totalaccounts:"+Totalaccounts);
	System.out.println("account_num:"+account_num);
	System.out.println("Customername:"+Customername);
System.out.println("balance:"+balance);
	
}



	public static void main(String[] args) {

		Deposit();
	}

	
}
