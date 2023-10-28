package com.xyz.projectname.modulename.functionality1;


public class Calculator {   // Template 

	
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir"));
		
//		additionOfTwoNumbers(5, 9);  /SeleniumTraining_B14/src/propfiles
//		
//		multiplicationOfTwoNumbers(10, 2);
//		
//		subOfTwoNumbers(10, 50);
//		
//		divOfTwoNumbers(15, 45);

	}
	
	public static void additionOfTwoNumbers(int a, int b) {  // local variables 
		
		int c = a + b; // * / % -
		
		System.out.println("addition Of Two Numbers is: " + c);
		
	}
	
	public static void multiplicationOfTwoNumbers(int a, int b) {  // local variables 
		
		int c = a * b; // * / % -
		
		System.out.println("multiplicationOfTwoNumbers Of the next Two Numbers is: " + c);
		
	}
	
	public static void subOfTwoNumbers(int a, int b) {  // local variables 
		
		int c = b - a; // * / % -
		
		System.out.println("subOfTwoNumbers Of Two Numbers is: " + c);
		
	}
	
	public static void divOfTwoNumbers(int a, int b) {  // local variables 
		
		int c = b/a; // * / % -
		
		System.out.println("divOfTwoNumbers Of the next Two Numbers is: " + c);
		
	}

}
