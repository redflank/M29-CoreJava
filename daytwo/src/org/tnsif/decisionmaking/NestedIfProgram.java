//Program to demonstrate Nested If statement

package org.tnsif.decisionmaking;

public class NestedIfProgram {
	public static void main(String[] args) {
		int x = 5;
		int y = 9;
		if(x==5) {
			if(y==8) {
				System.out.println("Correct number");
			}
			else {
				System.out.println("Wrong Number");
			}
		}
		else {
			System.out.println("Match Not Found");
		}
	}
}
