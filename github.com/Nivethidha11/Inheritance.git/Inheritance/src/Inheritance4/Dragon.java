package Inheritance4;

import java.util.Scanner;

public class Dragon extends Dino 
{
	boolean breathe,heat;
	Dragon(String species,String type,boolean breathe,boolean heat)
	{
		super(species,type);
		this.breathe=breathe;
		this.heat=heat;
	}
	void display()
	{
		int wings,scales;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of wings:");
		wings=s.nextInt();
		System.out.println("Enter no. of scales:");
		scales=s.nextInt();
		System.out.println("Dino Report\n\nDragon Dino Properties");
		System.out.println("Flies with "+wings+" wings");
		System.out.println("Has "+scales+" scales");
		System.out.println("\nInherited Dino Properties");
		if(breathe==true)
		{
			System.out.println(species +" breathes fire");
		}
		else
		{
			System.out.println(species +" doesn't breathes fire");
		}
		
		if(heat==true)
		{
			System.out.println("It is resistant to heat");
		}
		else
		{
			System.out.println("It is not resistant to heat");
		}
		System.out.print("\nInherited Base Dino Properties\n"+species+" is a "+type);
	}
}
