//program to demonstrate on method overloading
//driver class
package org.tnsif.methodoverloading;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		
		MethodOverloadingExample m1 = new MethodOverloadingExample();
		System.out.println(m1.multiplication(12.5f, 13.6f));
		System.out.println(m1.multiplication(5, 4));
		System.out.println(m1.multiplication(12.5f, 4));
		System.out.println(m1.multiplication(6, 13.4f));
		System.out.println(m1.print("Welcome to the course"));
		System.out.println(m1.print("Hello", "World"));
	
		
	}

}
