package com.Q2;

public class Owner {
	private String name;
	private Date dob;
	private String nic;
	public Owner() {
		
	}
	public Owner(String name, String nic, Date dob) {
		this.name = name;
		this.dob = dob;
		this.nic = nic;
	}
	public Owner(Owner owner) {
		this.name=owner.getName();
		this.dob=owner.getDob();
		this.nic=owner.getNic();
		
	}
	public void input() {
		
	}
	public void print() {
		System.out.println("name: "+ name);
		System.out.println("dob: "+ dob);
		System.out.println("nic: "+ nic);

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	@Override
	public String toString() {
		return "Owner [name=" + name + ", dob=" + dob + ", nic=" + nic + "]";
	}
	
	

}
