package org.tnsif.framework;

public abstract class BankFactory {

	abstract public SavingAcc getNewSavingAcc(int accNo, String AccNm, float accBal, boolean isSalaried);

	abstract public CurrentAcc getNewCurrentAcc(int accNo, String AccNm, float accBal, float creditLimit);
}
