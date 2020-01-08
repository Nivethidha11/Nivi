package Inheritance2;
import java.util.*;
public class AirLavaDino extends LavaDino 
{
	int no;
	float wingspeed;
	float ash;
	
	public AirLavaDino(String species,String type,float speed)
	{
		super(species,type,speed);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of wings: ");
		no=sc.nextInt();
		System.out.println("Enter speed/wing: ");
		wingspeed=sc.nextFloat();
		System.out.println("Enter ash resistance:");
		ash=sc.nextFloat();
	}
	
	
	void display()
	{
		float res=speed+(no*wingspeed)-ash;
		System.out.println("Dino Details\n" +"Species: " +species+"\n" +"Travels by air at a speed of "+res+" km/h");
	}
}
