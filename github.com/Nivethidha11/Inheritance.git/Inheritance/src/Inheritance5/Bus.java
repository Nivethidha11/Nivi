package Inheritance5;
import java.util.*;
public class Bus extends Ticket 
{
	Bus(String source,String destination,String date, int  number)
	{
		super(source,destination,date,number);
	}
	void display()
	{
		Scanner s=new Scanner(System.in);
		boolean ac,sleeper,wifi;
		int cost,ticketcost=1000,res;
		System.out.println("Need AC?");
		ac=s.nextBoolean();
		System.out.println("Need Sleeper?");
		sleeper=s.nextBoolean();
		System.out.println("Need Wifi?");
		wifi=s.nextBoolean();
		if(ac==true && sleeper==true && wifi==true)
		{
			cost=300;
		}
		else if(ac==true && sleeper==false && wifi==false || sleeper==true && ac==false && wifi==false || wifi==true && ac==false && sleeper== false)
		{
			cost=100;
		}
		else
		{
			cost=200;
		}
		for(int i=0;i<number;i++)
		{
			System.out.println("\nName : "+p[i].name+"\n"+"Age : "+p[i].age+"\n"+"Gender : "+p[i].gender+"\n"+"Mobile : "+p[i].mobile+"\n");
		}
		res=(ticketcost+cost)*number;
		System.out.println("Total Amount  Rs."+res);
	}
}
