package Inheritance5;

public class Passanger 
{
	String name,mobile,gender;
	int age;
	Passanger(String name,int age,String gender,String mobile)
	{
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
}
