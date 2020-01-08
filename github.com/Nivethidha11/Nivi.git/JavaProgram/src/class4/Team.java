package class4;

import java.util.Scanner;

public class Team 
{
	String name;
	String city;
	int ch;
	Scanner q=new Scanner(System.in);
	Team(String name,String city)
	{
		this.name = name;
		this.city = city;
	}
	public String getName() 
	{
		return name;
	}
	public String getCity() {
		return city;
	}
	void display()
	{
		System.out.print("VERIFY AND UPDATE DETAILS" +"\n" + "1. Update Team Name" + "\n" + "2. Update City Represented" + "\n" + "3. Save and Exit");
		System.out.print("\n" +"Enter choice: ");
		int ch=q.nextInt();
		switch(ch)
		{
		case 1: System.out.print("Enter team name: ");
		String newname=q.next();
		name=newname;
		System.out.print("Team: "+newname+"\n"+"City: "+city);
		break;
		case 2: System.out.print("Enter city represented: ");
		String newcity=q.next();
		city=newcity;
		System.out.print("Team: "+name+"\n"+"City: "+newcity);
		break;
		case 3:
		System.out.print("Thank you!");
		break;
		}
		
	}
}
