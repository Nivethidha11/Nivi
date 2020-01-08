package Inheritance1;

public class Dinosar {
	String species,type;
	boolean heat;
	Dinosar(String species,String type,boolean heat)
	{
		this.species=species;
		this.type=type;
		this.heat=heat;
	}
	public String getSpecies() {
		return species;
	}
	public String getType() {
		return type;
	}
	public boolean getHeat() {
		return heat;
	}
}
