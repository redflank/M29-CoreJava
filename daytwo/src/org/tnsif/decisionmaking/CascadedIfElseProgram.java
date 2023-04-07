//Program to Demonstrate Cascaded If-Else

package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values of percentage:");
		float percentage1 = s.nextFloat();
		float percentage2 = s.nextFloat();
		float percentage3 = s.nextFloat();
		if(percentage1>percentage2 && percentage1>percentage3) {
			System.out.println("Person 1 has highest percentage");
		}
		else if(percentage2>percentage1 && percentage2>percentage3) {
			System.out.println("Person 2 has highest percentage");
		}
		else {
			System.out.println("Person 3 has highest percentage");
		}
		s.close();
	}
}
	
