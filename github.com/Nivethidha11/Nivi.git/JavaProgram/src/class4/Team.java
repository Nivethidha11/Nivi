package class4;

import java.util.Scanner;
public class Team 
{
	Scanner q=new Scanner(System.in);
	String name=q.next();
	String city=q.next();

	public String getName() 
	{
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
