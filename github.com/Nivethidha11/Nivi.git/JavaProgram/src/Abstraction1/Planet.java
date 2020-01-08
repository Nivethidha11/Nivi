package Abstraction1;

public abstract class Planet 
{
	String name;
	Planet(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void display();
}
