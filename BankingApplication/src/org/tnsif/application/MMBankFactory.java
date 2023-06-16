package org.tnsif.application;

import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String AccNm, float accBal, boolean isSalaried) {
		MMSavingAcc s = new MMSavingAcc(accNo, AccNm, accBal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String AccNm, float accBal, float creditLimit) {
		MMCurrentAcc s1 = new MMCurrentAcc(accNo, AccNm, accBal, creditLimit);
		return s1;
	}
		
	
}
