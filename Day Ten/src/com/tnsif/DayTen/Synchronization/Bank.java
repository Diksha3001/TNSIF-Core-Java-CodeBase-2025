package com.tnsif.DayTen.Synchronization;

public interface Bank {
	
	static final int MINBAL=5000;
	static final int DAILY_LIMIT=25000;
	public void deposit(int amt)throws DepositeLimitException;

	public void withdraw(int amt)throws InsufficientBalanceException;
	

}
