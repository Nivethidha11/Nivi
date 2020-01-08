package Inheritance4;

public class Dino 
{
	String species,type;
	Dino(String species,String type)
	{
		this.species=species;
		this.type=type;
	}
	public String getSpecies() {
		return species;
	}
	
	public String getType() {
		return type;
	}
	void display()

	{
		System.out.print("Dino Report\nBase Dino Properties\n"+species+" is a "+type);

	}
}
