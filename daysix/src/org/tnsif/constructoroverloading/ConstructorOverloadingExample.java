//Program to demonstrate on constructor overloading
package org.tnsif.constructoroverloading;

public class ConstructorOverloadingExample {

	private int x;
	private int y;

	// constructor overloading
	public ConstructorOverloadingExample() {
		System.out.println("Default Constructor");
	}

	public ConstructorOverloadingExample(int x) {
		System.out.println("This is a parameterized Constructor: " + x);
	}

	public ConstructorOverloadingExample(int x, int y) {
		System.out.println("This is a parameterized Constructor: " + x +" "+ + y);
	}
}
