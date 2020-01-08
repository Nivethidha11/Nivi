package Inheritance5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String source,destination,date;
		int number;

		Scanner s=new Scanner(System.in);
		
		System.out.println("1. Bus\n2. Train\n3. Flight\nEnter the choice");
		int ch=s.nextInt();
		
		System.out.println("Ticket Details");
		System.out.println("Enter the source");
		source=s.next();
		System.out.println("Enter the destination");
		destination=s.next();
		System.out.println("Enter the date");
		date=s.next();
		System.out.println("Enter the number of passengers");
		number=s.nextInt();
		
		
		
		if(ch==1)
		{
			Bus b=new Bus(source,destination,date,number);
			b.display();
		}
		else if(ch==2)
		{
			Train t=new Train(source,destination,date,number);
			t.display();
		}
		else
		{
			Flight f=new Flight(source,destination,date,number);
			f.display();
		}
		
	}

}
