//Program to Demonstrate User Input
package org.tnsif.userinput;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		//user input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary:");
		float salary = sc.nextFloat();
		
		System.out.println("Enter your name:");
		//next(0 is used to get first word of sentence
		String name = sc.next();
		
		//nextLine() is used to get entire sentence of the string
	
		System.out.println("Salary is: "+salary);
		System.out.println("Name is: "+name);
		
		sc.close();
		

	}

}
