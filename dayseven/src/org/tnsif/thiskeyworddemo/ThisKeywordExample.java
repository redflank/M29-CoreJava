//program to demonstrate on this keyword
package org.tnsif.thiskeyworddemo;

public class ThisKeywordExample {
	private int cvvNo;
	private long atmNo;

	// parameterized constructor
	public ThisKeywordExample(int cvvNo, long atmNo) {
		super();
		this.cvvNo = cvvNo;
		this.atmNo = atmNo;

//		cvvNo = cvvNo;
//		atmNo = atmNo;
	}

	public void print()
	{
		System.out.println("CVV no is :"+ cvvNo + " "+ "ATM Card "+atmNo);
	}
}