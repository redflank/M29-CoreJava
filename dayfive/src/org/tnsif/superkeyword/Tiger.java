//Child class
package org.tnsif.superkeyword;

public class Tiger extends Animal {
	public String animalType = "Tiger-Wild";
	public int noOfLegs = 4;

	
	
	
	public Tiger() {
		super();
		System.out.println("Tiger Class Constructor- Child Class");
	}




	public void display() {
		super.display();
		System.out.println(super.animalType);
		System.out.println(super.noOfLegs);
		System.out.println("Animal type: " + animalType);
		System.out.println("No of legs: " + noOfLegs);
	}

}
