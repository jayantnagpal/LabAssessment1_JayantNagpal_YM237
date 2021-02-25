package com.Q2;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date() {
		
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(Date date) {
		this.day=date.getDay();
		this.month=date.getMonth();
		this.year=date.getYear();
	}
	public void input() {
		
	}
	public void print() {
		System.out.println("Day: "+ day);
		System.out.println("Month: "+ month);
		System.out.println("Year: "+ year);
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
