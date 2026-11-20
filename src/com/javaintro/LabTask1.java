package com.javaintro;

public class LabTask1 { 

	 static LabTask1 c1=new LabTask1();
	 
	 static LabTask1 c2=new LabTask1();
	 
	 static LabTask1 c3=new LabTask1();
	 
	 static LabTask1 c4=new LabTask1();


	int Acc_num;
	String Holder_name;
	String Mobile_num;
	int Balance;
	String Branch;

	static void Method1(){
		

		 c1.Acc_num=101;
		 c1.Holder_name="Sirisha";
		 c1.Mobile_num="770287399";
		 c1.Balance =200;
		 c1.Branch="CSE";
			

		 c2.Acc_num=102;
		 c2.Holder_name="Asha";
		 c2.Mobile_num="77875899";
		 c2.Balance =2000;
		 c2.Branch="ECE";
		 

		 c3.Acc_num=103;
		 c3.Holder_name="SRI";
		 c3.Mobile_num="555559";
		 c3.Balance =7000;
		 c3.Branch="CSE";
		 
		 
		 c4.Acc_num=104;
		 c4.Holder_name="SUMA";
		 c4.Mobile_num="77054334";
		 c4.Balance =3000;
		 c4.Branch="MCA";
		c1.Method2();
		
		 
	}


		 void  Method2(){
			 
				System.out.println("Acc_num:"+c1.Acc_num);
				System.out.println("Holder_name:"+c1.Holder_name);
				System.out.println("Mobile_num:"+c1.Mobile_num);
				System.out.println("Balance:"+c1.Balance);
				System.out.println("Branch:"+c1.Branch);


				System.out.println("Acc_num:"+c2.Acc_num);
				System.out.println("Holder_name:"+c2.Holder_name);
				System.out.println("Mobile_num:"+c2.Mobile_num);
				System.out.println("Balance:"+c2.Balance);
				System.out.println("Branch:"+c2.Branch);

				System.out.println("Acc_num:"+c3.Acc_num);
				System.out.println("Holder_name:"+c3.Holder_name);
				System.out.println("Mobile_num:"+c3.Mobile_num);
				System.out.println("Balance:"+c3.Balance);
				System.out.println("Branch:"+c3.Branch);


				System.out.println("Acc_num:"+c4.Acc_num);
				System.out.println("Holder_name:"+c4.Holder_name);
				System.out.println("Mobile_num:"+c4.Mobile_num);
				System.out.println("Balance:"+c4.Balance);
				System.out.println("Branch:"+c4.Branch);

				
				
		 }


	
	public static void main(String[] args) {
Method1(); 

	}

}
