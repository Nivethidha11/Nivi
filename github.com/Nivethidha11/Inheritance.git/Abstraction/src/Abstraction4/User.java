package Abstraction4;

import java.util.Scanner;

public class User
{
	String name,mobile,email;
	float bcash;
	Booking[] list;
	User(String name,String email,String mobile,float bcash)
	{
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.bcash = bcash;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getBcash() {
		return bcash;
	}
	public void setBcash(float bcash) {
		this.bcash = bcash;
	}
	public Booking[] getList() {
		return list;
	}
	public void setList(Booking[] list) {
		this.list = list;
	}
	
	void display()
	{
		Scanner s=new Scanner(System.in);
		String newname=s.next();
		String newemail=s.next();
		String newmobile=s.next();
		
		if(!(newname.equals(name)))
		{
			name=newname;
		}
		else if(!(newemail.equals(email)))
		{
			email=newemail;
		}
		else if(!(newmobile.equals(mobile)))
		{
			mobile=newmobile;
		}
		System.out.println("Name "+name+"\nEmail "+email+"\nMobile "+mobile);
	}
	void recharge()
	{
		Scanner s=new Scanner(System.in);
		float amount=s.nextFloat();
		float bookingamount=amount+bcash;
		System.out.println("Recharge BCash "+bookingamount);
	}
}
