package Inheritance2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
			int ch;
			String species,type;
			float speed;
			
			Scanner s=new Scanner(System.in);
			System.out.print("1. Land Dino\n2. Aqua Dino\n3. Aerial Dino\nEnter choice: ");
			ch=s.nextInt();
			System.out.print("\n");
			System.out.print("Enter species: ");
			species=s.next();
			System.out.print("\n");
			System.out.print("Enter type:");
			type=s.next();
			System.out.print("\n");
			System.out.print("Enter speed: ");
			speed = s.nextFloat();
			if(ch==3)
			{
				AirLavaDino a= new AirLavaDino(species,type,speed);
				a.display();
			}
			else if(ch==2)
			{
				WaterLavaDino w= new WaterLavaDino(species,type,speed);
				w.display();
			}
			else
			{
				LandLavaDino l= new LandLavaDino(species,type,speed);
				l.display();
				
			}
	}
}
