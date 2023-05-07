//Program to demonstrate on interface
package org.tnsif.interfacedemo;

public interface atmMachine {
	// all the variables inside an interface are by default public static final
	// so here the amount is final type and it should be initialized
	int amountWithdraw = 10000;
	int amountDeposit = 5000;

	// by default all the methods inside an interface are public abstract
	void withdraw();

	void deposit();

}
