//Program to demonstrate on abstract class and abstract keyword
package org.tnsif.abstractkeyworddemo;

/*if any class contains abstract method then that class must be declared as abstract class*/

public abstract class Remote {

	public String cellName;
	/* abstract class can contain abstract as well as non abstract methods */

	// abstract method
	abstract void functionRemote();

	abstract void create();

	// concrete method
	public void display() {
		System.out.println("Cell name is: " + cellName);
	}

}

//implementable class
class RemoteChild extends Remote {
	void functionRemote() {
		System.out.println("Abstract Method is Implemented");
	}

	@Override
	void create() {
		System.out.println("2 method of abstract class");

	}
}
