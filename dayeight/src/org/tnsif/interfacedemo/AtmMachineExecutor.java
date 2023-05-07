//Driver Class
package org.tnsif.interfacedemo;

public class AtmMachineExecutor {

	public static void main(String[] args) {
		//we can't instantiate any interfaces
		
		atmMachine r1 = new AtmMachineChild();
		r1.withdraw();
		r1.deposit();

	}

}
