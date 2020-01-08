package Inheritance2;

public class LavaDino 
{
	String species,type;
	float speed;
	public LavaDino(String species,String type,float speed)
	{
		this.species = species;
		this.type = type;
		this.speed = speed;
	}
	public String getSpecies() {
		return species;
	}
	
	public String getType() {
		return type;
	}
	
	public float getSpeed() {
		return speed;
	}
	
}
