package Inheritance4;

import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1. Dinosaur\n2. Lava Dinosaur\n3. Dragon Dinosaur\nEnter type: ");
		int ch=s.nextInt();
		if(ch==1)
		{
			System.out.println("Enter species: ");
			String species=s.next();
			System.out.println("Enter consumption: ");
			String type=s.next();	
			Dino d=new Dino(species,type);
			d.display();
		}
		else if(ch==2)
		{
			System.out.println("Enter species: ");
			String species=s.next();
			System.out.println("Enter consumption: ");
			String type=s.next();
			System.out.println("Breathes fire? (y/n) ");
			boolean breathe=s.nextBoolean();
			System.out.println("Is heat resistant? (y/n) ");
			boolean heat=s.nextBoolean();
			Lava l=new Lava(species,type,breathe,heat);
			l.display();
		}
		else
		{
			System.out.println("Enter species: ");
			String species=s.next();
			System.out.println("Enter consumption: ");
			String type=s.next();
			System.out.println("Breathes fire? (y/n) ");
			boolean breathe=s.nextBoolean();
			System.out.println("Is heat resistant? (y/n) ");
			boolean heat=s.nextBoolean();
			Dragon dd=new Dragon(species,type,breathe,heat);
			dd.display();
		}
		
		
	}
}
