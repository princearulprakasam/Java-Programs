package com.perficient;
interface SavingsAccount {
	  public void savingsaccount(); // interface method
	}

	interface CurrentAccount {
	  public void currentaccount(); // interface method
	}

	  class Accounts implements SavingsAccount, CurrentAccount {
	  public void savingsaccount() {
	    System.out.println("Savings Account Interest rate is 7%");
	  }
	  public void currentaccount() {
	    System.out.println("Current Account Interest rate is 10%");
	  }
	}
public class Interfaces {
	public static void main(String[] args) {
	    Accounts myObj = new Accounts();
	    myObj.savingsaccount();
	    myObj.currentaccount();
}
}