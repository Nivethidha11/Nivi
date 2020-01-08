package Abstraction3;

public abstract class Star 
{
	String name,conname;
	int decay,energyemit;
	Star(String name,String conname,int energyemit,int consumed)
	{
		super();
		this.name = name;
		this.conname = conname;
		this.energyemit = energyemit;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getConname() {
		return conname;
	}
	public void setConname(String conname) {
		this.conname = conname;
	}
	public int getDecay() {
		return decay;
	}
	public void setDecay(int decay) {
		this.decay = decay;
	}
	public int getEnergyemit() {
		return energyemit;
	}
	public void setEnergyemit(int energyemit) {
		this.energyemit = energyemit;
	}
	
	abstract public float calculateYearsRemaining();
	
	 float calculateEmissionRate(int decay,int consumed)
	 {
		 float res=(float)(energyemit-consumed)/(float)(this.calculateYearsRemaining());
		 return res;
		 
	 }
	
	
}
