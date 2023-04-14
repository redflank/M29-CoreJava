//Program to demonstrate on Super Keyword
package org.tnsif.superkeyword;

public class Animal {
	public String animalType = "Wild";
	public int noOfLegs = 2;

	public void display() {
		System.out.println("Animal type: " + animalType);
		System.out.println("No of legs: " + noOfLegs);
	}

	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}

}
