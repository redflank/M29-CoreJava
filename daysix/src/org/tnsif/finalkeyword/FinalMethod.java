//Program to demonstrate final keyword
package org.tnsif.finalkeyword;

public class FinalMethod {

	// default constructor
	public FinalMethod() {
		super();

		System.out.println("default constructor");

	}

	// final variable
	final float salary = 2700.89f;

	// Final method
	final void show() {

		System.out.println("Salary is " + salary);
	}

}
