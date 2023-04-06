//Program to Demonstrate Decision making(If-Else)
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Weight and Age of the donor:");
		int weight = sc.nextInt();
		int age = sc.nextInt();
		if(weight > 50 && age > 18) {
			System.out.println("The donor is Eligible");
		}
		else {
			System.out.println("The donor is not Eligible");
		}
		
		sc.close();

	}

}
