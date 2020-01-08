package Inheritance2;
import java.util.*;
public class LandLavaDino extends LavaDino
{
	int legs;
	public LandLavaDino(String species,String type,float speed)
	{
		super(species,type,speed);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of feet: ");
		legs=s.nextInt();
	}
	void display() 
	{
		float result=speed*legs;
		System.out.println("Dino Details\n" +"Species: " +species+"\n" +"Travels by air at a speed of "+result+" km/h");
	}
}
