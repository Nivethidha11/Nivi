package Inheritance5;

import java.util.Scanner;

public class Flight extends Ticket {
	Flight(String source,String destination,String date, int  number)
	{
		super(source,destination,date,number);
	}
	void display()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the class details");
		String classno=s.next();
		System.out.println("Enter the luggage weight");
		float weight=s.nextFloat();
		float kg=20,totalkg,finalresult;
		int cost;
		for(int i=0;i<number;i++)
		{
			System.out.println("\nName : "+p[i].name+"\n"+"Age : "+p[i].age+"\n"+"Gender : "+p[i].gender+"\n"+"Mobile : "+p[i].mobile+"\n");
		}
		if(classno.equals("first"))
		{
			cost=1500;
		}
		else if(classno.equals("second"))
		{
			cost=1000;
		}
		else
		{
			cost=500;
		}
		totalkg=weight*kg;
		finalresult=(totalkg+cost)*number;
		System.out.println("Total Amount  Rs."+finalresult);
	}

}
