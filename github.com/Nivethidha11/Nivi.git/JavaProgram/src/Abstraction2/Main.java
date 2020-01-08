package Abstraction2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1. Star Door\n2. Gas Door\n3. Liquid Door\nEnter the choice");
		int ch=s.nextInt();
		
		if(ch==1)
		{
			System.out.println("Enter Name");
			String name=s.next();
			System.out.println("Enter Stars");
			int star=s.nextInt();
			Star st=new Star(name,star);
			st.unlock();
		}
		
		else if(ch==2)
		{
			System.out.println("Enter Name");
			String name=s.next();
			System.out.println("Enter gas");
			String gas=s.next();
			Gas g=new Gas(name,gas);
			g.unlock();
		}
		
		else if(ch==3)
		{
			System.out.println("Enter Name");
			String name=s.next();
			System.out.println("Enter flow");
			int flow=s.nextInt();
			Liquid l=new Liquid(name,flow);
			l.unlock();
		}
	}

}
