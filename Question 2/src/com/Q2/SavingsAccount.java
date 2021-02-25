package com.Q2;

public class SavingsAccount extends Account {
	private float interestRate;

	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(SavingsAccount savingsAccount) {
		this.setOwner(savingsAccount.getOwner());
		this.setBalance(savingsAccount.getBalance());
		this.setNumber(savingsAccount.getNumber());
		this.interestRate=savingsAccount.getInterestRate();
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public void input() {
		
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("interest rate: " + this.getInterestRate());
		
	}

	@Override
	public String toString() {
		return " SavingsAccount [interestRate=" + interestRate + "]";
	}
}
