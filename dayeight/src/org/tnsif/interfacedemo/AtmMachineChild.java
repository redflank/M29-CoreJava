package org.tnsif.interfacedemo;

public class AtmMachineChild implements atmMachine {
//implementable class
	@Override
	public void withdraw() {
		System.out.println("Amount Withdrawn: " + amountWithdraw);

	}

	@Override
	public void deposit() {
		System.out.println("Amount Deposited: " + amountDeposit);

	}

}
