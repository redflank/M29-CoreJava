//Program to Demonstrate Arithmetic Operator
// +, -, *, /(returns quotient value, %(returns remainder value))

package org.tnsif.operatordemo;

import java.util.Scanner;

public class ArithmeticOperatorprogram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of x and y:");
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println("The addition of Two Numbers: "+(x+y));
		System.out.println("The subtraction of Two Numbers: "+(x-y));
		System.out.println("The multiplication of Two Numbers: "+(x*y));
		System.out.println("The division of Two Numbers: "+(x/y));
		System.out.println("The modulo of Two Numbers: "+(x%y));
		s.close();
	}
	

}
