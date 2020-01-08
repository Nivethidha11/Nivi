package Inheritance1;

public class LavaDino extends Dinosar
{
	LavaDino(String species,String type,boolean heat)
	{
		super(species,type,heat);
	}
	void display()
	{
		System.out.println("Dino Details\nSpecies: "+species+"\n"+"Type: "+type);
		if(heat==true)
		{
			System.out.println("Lives on underground");
		}
		else
		{
			System.out.println("Did not survive");
		}
		
	}
}
