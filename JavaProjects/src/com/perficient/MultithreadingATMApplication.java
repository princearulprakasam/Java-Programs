package com.perficient;
class InsufficientFundsException extends Exception
{
	String name;
	InsufficientFundsException(String name)
	{
		this.name=name;
	}
	String getErrorMessage() {
		return this.name;
	}
}
class Account{
	private int balance;
	Account(int balance)
	{
		this.balance=balance;
	}
	public int getBalance()
	{
		return this.balance;
	}
	synchronized void withdraw(int amount) throws InsufficientFundsException
	{
		System.out.println("Trying to withdraw:"+amount);
		System.out.println("Balance in account:"+this.balance);
		if(amount<=this.balance)
		{
			System.out.println("Collect the cash:"+amount);
			this.balance=this.balance-amount;
		}
		else
		{
			throw new InsufficientFundsException("No funds....");
		}
	}
}
class AccountThread extends Thread
{
	Account atm;
	int amt;
	AccountThread(Account atm, int amt)
	{
		this.atm=atm;
		this.amt=amt;
	}
	public void run()
	{
		try
		{
			atm.withdraw(amt);
		}
		catch(InsufficientFundsException ie)
		{
			System.out.println("Error:"+ie.getErrorMessage());
		}
	}
}
public class MultithreadingATMApplication {
	public static void main(String args[]) throws InterruptedException
	{
		Account atm=new Account(6000);
		System.out.println("Initial amount in the account:"+atm.getBalance());
		AccountThread t1= new AccountThread(atm, 4000);
		AccountThread t2= new AccountThread(atm, 3000);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final amount in the account:"+atm.getBalance());
	}
}
