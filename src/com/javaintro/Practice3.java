package com.javaintro;

public class Practice3 {
void hello(){
	// out of scope
	Practice3 p3=new Practice3();
}
	protected void finalize () throws Throwable{
	System.out.println("Finalize method ");
	}
	public static void main(String[] args) {

		Practice3 p =new Practice3();
		Practice3 p1 =new Practice3();
		Practice3 p2 =new Practice3();

// nullifying the object
		
		p= null; //object1 eligible for gc
		
		// Reassigning object
		p2=p1; // object2 eligibile for gc
		
		//Anonymous object
		new Practice3();
		p1.hello();
		System.gc();
		
	}

}
