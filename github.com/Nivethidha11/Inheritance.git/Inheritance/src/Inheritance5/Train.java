package Inheritance5;

import java.util.Scanner;

public class Train extends Ticket {
	Train(String source,String destination,String date, int  number)
	{
		super(source,destination,date,number);
	}
	void display()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the class details");
		String coach=s.next();
		System.out.println("Enter no. of meals required");
		int meals=s.nextInt();
		int cost,result,costmeals=50,totalmeals;
		for(int i=0;i<number;i++)
		{
			System.out.println("\nName : "+p[i].name+"\n"+"Age : "+p[i].age+"\n"+"Gender : "+p[i].gender+"\n"+"Mobile : "+p[i].mobile+"\n");
		}
		if(coach.equals("first"))
		{
			cost=1500;
		}
		else if(coach.equals("second"))
		{
			cost=1000;
		}
		else
		{
			cost=500;
		}
		totalmeals=costmeals*meals;
		result=(totalmeals+cost)*number;
		System.out.println("Total Amount  Rs."+result);
	}
}
