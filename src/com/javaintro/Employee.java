package com.javaintro;

public class Employee {

	// (iv) Out of Scope when method completed it will be out of scope

	 void hello() {
		Employee e = new Employee();
	}

	protected void finalize() throws Throwable {
		System.out.println("Finalize method is started");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
Employee e1= new Employee();
Employee e2= new Employee();
Employee e3= new Employee();

//(i) Nullifying the object
e1=null;
// (ii) Re-assigning of objects
e3 = e2;
  
// (iii) Anonymous object

new Employee();
e2.hello( );
System.gc(); // here gc collector calls the finalize method
	}
}
