package Inheritance5;
import java.util.*;
public class Ticket 
{
	String source,destination,date;
	int number;
	
	String name,mobile,gender;
	int age;
	public Passanger p[];
	Ticket(String source,String destination,String date, int  number)
	{
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.number = number;
		p=new Passanger[number];
		int i;
		Scanner s=new Scanner(System.in);
		for(i=0;i<number;i++)
		{
			System.out.println("Passenger Details");
			System.out.println("Enter the name");
			name=s.next();
			System.out.println("Enter the age");
			age=s.nextInt();
			System.out.println("Enter the gender");
			gender=s.next();
			System.out.println("Enter the mobile");
			mobile=s.next();
			p[i]=new Passanger(name,age,gender,mobile);
		}
	}
	
	public String getSource() {
		return source;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public String getDate() {
		return date;
	}
	
	public int getNumber() {
		return number;
	}
	
	
}
