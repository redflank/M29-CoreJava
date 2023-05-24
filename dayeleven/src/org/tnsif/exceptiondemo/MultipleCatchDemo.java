//Program to demonstrate on multiple catch block
package org.tnsif.exceptiondemo;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		int arr[] = new int[] { 101, 33, 78 };
		System.out.println("Array is: ");
		
		try {
			System.out.println(arr[3]);
			
		}
		/* we can use multiple catch block
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled "+e);
			
	    }
		catch(ArithmeticException e) {
			System.out.println("Exception handled "+e);
		}
		*/
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e);
		}
		
		
		

	}

}
