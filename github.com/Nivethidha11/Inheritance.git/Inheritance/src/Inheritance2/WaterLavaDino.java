package Inheritance2;

import java.util.Scanner;

public class WaterLavaDino extends LavaDino
{
	int fin;
	float tail,multiplier;
	public WaterLavaDino(String species,String type,float speed)
	{
		super(species,type,speed);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of fins:");
		fin=s.nextInt();
		System.out.println("Enter no. of tails:");
		tail=s.nextFloat();
		System.out.println("Enter lava multiplier:");
		multiplier=s.nextFloat();
	}
	void display() 
	{
		float results=(speed+fin+tail)*multiplier;
		System.out.println("Dino Details\n" +"Species: " +species+"\n" +"Travels by air at a speed of "+results+" km/h");
	}
}
