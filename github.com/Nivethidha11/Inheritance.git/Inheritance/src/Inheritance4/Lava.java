package Inheritance4;

public class Lava extends Dino
{
	boolean breathe,heat;
	Lava(String species,String type,boolean breathe,boolean heat)
	{
		super(species,type);
		this.breathe=breathe;
		this.heat=heat;
	}
	void display()
	{
		System.out.println("Dino Report\nLava Dino Properties");
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
