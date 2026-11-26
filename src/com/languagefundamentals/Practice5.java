package com.languagefundamentals;

public class Practice5 {
	
	
	

	public static void main(String[] args)  throws ClassNotFoundException{
		System.out.println("hello world");
		Class.forName("java.lang.String"); // bootstrap class loader
		Class.forName("java.lang.System"); // bootstrap class loader
		Class.forName("com.languagefundamentals.Test1"); // application class loaderSSSS
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("hello world end");

	}

}

