package com.Q2;

public class Account {
	private Owner owner;
	private float balance;
	private String number;
	public Account() {
		
	}
	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}
	public Account(Account account) {
		this.owner=account.getOwner();
		this.balance=account.getBalance();
		this.number=account.getNumber();
	}
	public Owner getOwner() {
		return owner;
	}
	public float getBalance() {
		return balance;
	}
	public String getNumber() {
		return number;
	}
	
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void input() {
		
	}
	
	public void print() {
		System.out.println("owner: "+ owner);
		System.out.println("balance: "+ balance);
		System.out.println("number: "+ number);
	}
	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}
	
	public void deposit(float amount) {
		this.balance=this.balance+amount;
	}
	
	public void withdraw(float amount) {
		this.balance=this.balance-amount;
	}
	
	
	
	

}
