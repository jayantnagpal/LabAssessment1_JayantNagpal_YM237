package com.Q2;

public class CurrentAccount extends Account {
	private float minimumBalance;

	public CurrentAccount() {
		super();
	}
	
	public CurrentAccount(CurrentAccount currentAccount) {
		this.setOwner(currentAccount.getOwner());
		this.setBalance(currentAccount.getBalance());
		this.setNumber(currentAccount.getNumber());
		this.minimumBalance=currentAccount.getMinimumBalance();
	}
	
	@Override
	public void input() {
		
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("minimum balance: " + this.getMinimumBalance());
		
	}

	@Override
	public String toString() {
		return "CurrentAccount [minimumBalance=" + minimumBalance + "]";
	}

	public float getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(float minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	
	
	

}
