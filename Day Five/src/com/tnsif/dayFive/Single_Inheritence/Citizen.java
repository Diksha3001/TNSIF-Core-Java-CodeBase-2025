package com.tnsif.dayFive.Single_Inheritence;

public class Citizen {

	
	private String name;
	private String adharNo;
	private String address;
	private String phoneNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Citizen(String name, String adharNo, String address, String phoneNo) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	public Citizen() {
		super();
		System.out.println("Citizen Class Object is created");
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", address=" + address + ", phoneNo=" + phoneNo + "]";
	}
	

}
