package com.xyz.projectname.modulename.functionality1;


public class FirstProgram {   // Template 

	int a, b, c, d;// global variables 
	
	public static void main(String[] args) {
		
		System.out.println("Hello World !!!");
		
		//System.out.println();
		FirstProgram.additionOfTwoNumbers(5, 9);
			
		System.out.println("I am done with additionOfTwoNumbers");
		
		multiplicationOfTwoNumbers(10, 230);

	}
	
	public static void additionOfTwoNumbers(int a, int b) {  // local variables 
		
		int c = a + b; // * / % -
		
		System.out.println("addition Of Two Numbers is: " + c);
		
	}
	
	public static void multiplicationOfTwoNumbers(int a, int b) {  // local variables 
		
		int c = a * b; // * / % -
		
		System.out.println("multiplicationOfTwoNumbers Of the next Two Numbers is: " + c);
		
	}

}
