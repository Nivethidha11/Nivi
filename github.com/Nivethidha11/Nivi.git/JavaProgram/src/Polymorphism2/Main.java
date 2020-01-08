package Polymorphism2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter energy");
		float energy=s.nextFloat();
		s.nextLine();
		System.out.println("Enter the sound");
		String sounds=s.nextLine();
		
		System.out.println("Enter height");
		float height=s.nextFloat();
		
		System.out.println("Enter distance");
		int distance=s.nextInt();
		
		Cat c=new Cat(energy,sounds,height,distance);
		
		System.out.println("Enter the choice");
		int ch=s.nextInt();
		int x2;
		float x,y,z,x1,y1,y2;
		double z1,z2;
		Machine m=new Machine();
		if(ch==1)
		{
			x=c.generateEnergy(sounds);
			x1=m.addEnergy((int)x);
			x2=m.runFan((int)x1);
			System.out.println("Remaining Energy : "+x2);
		}
		else if(ch==2)
		{
			y=c.generateEnergy(height);
			y1=m.addEnergy(y);
			y2=m.runFan(y1);
			System.out.println("Remaining Energy : "+y2);
		}
		else
		{
			z=c.generateEnergy(distance);
			z1=m.addEnergy((double)z);
			z2=m.runFan(z1);
			System.out.println("Remaining Energy : "+z2);
		}
	}

}
