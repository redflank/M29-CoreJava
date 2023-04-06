//Program to demonstrate Switch Case

package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int songInput = s.nextInt();
		switch(songInput) {
		case 1:
			System.out.println("Dil main baji guitar");
			break;
		case 2:
			System.out.println("Mallem song");
			break;
		case 3:
			System.out.println("Tum Se Hi");
			break;
			default:
				System.out.println("Invalid Input");
		}

	}

}
