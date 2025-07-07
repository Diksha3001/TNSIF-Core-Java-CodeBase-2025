package com.tnsif.dayFive.Single_Inheritence;

public class Student extends Citizen {
	
	//data members
	private int rollNo;
	private String CollegeName;
	
	//non parameterized constructor
	public Student()
	{
		super();
	}
	
	public Student(String name, String adharNo, String address, String phoneNo,int rollNo,String CollegeName)
	{
		super(name,adharNo,address,phoneNo);
		this.rollNo=rollNo;
		this.CollegeName=CollegeName;
	}

	//Getter and Setter methods
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return CollegeName;
	}

	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", CollegeName=" + CollegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhoneNo()=" + getPhoneNo()
				+ "]";
	}

	
	
}
