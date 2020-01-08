package Abstraction3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Star Details\n");
		System.out.println("Enter star name");
		String name=s.next();
		
		System.out.println("Enter constellation name");
		String conname=s.next();
		
		System.out.println("Enter decay index");
		int decay=s.nextInt();
		
		System.out.println("Enter energy to emit");
		int energyemit=s.nextInt();

		System.out.println("Calculate Emission Rate");
		System.out.println("Enter age");
		int age=s.nextInt();
		
		System.out.println("Enter energy consumed");
		int consumed=s.nextInt();
		
		System.out.println("1. Plasma Star\n2. Radium Star\n3. Dark Star\nEnter the choice");
		int ch=s.nextInt();
		
		float a,b,c;
		
		if(ch==1)
		{
			Plasma p=new Plasma(name,conname,decay,energyemit,age,consumed);
			a=p.calculateEmissionRate(decay,consumed);
			System.out.println(a);
		}
		else if(ch==2)
		{
			Radium r=new Radium(name,conname,decay,energyemit,age,consumed);
			b=r.calculateEmissionRate(decay,consumed);
			System.out.println(b);	
		}
		else
		{
			Dark d=new Dark(name,conname,decay,energyemit,age,consumed);
			c=d.calculateEmissionRate(decay,consumed);
			System.out.println(c);
		}
	}

}
