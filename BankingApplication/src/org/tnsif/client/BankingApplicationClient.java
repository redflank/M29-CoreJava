package org.tnsif.client;

import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class BankingApplicationClient {

	public static void main(String[] args) {
		SavingAcc s = new MMSavingAcc(1221, "Pratik Desai", 21333, true);
		CurrentAcc c = new MMCurrentAcc(1222, "Prathamesh Chavan", 12000, 9000);

		System.out.println(s);
		System.out.println(c);

		System.out.println();

		System.out.println("Saving Account");

		s.withdraw(200);


		System.out.println("\nCurrent Account");
		c.withdraw(400);


	}

}