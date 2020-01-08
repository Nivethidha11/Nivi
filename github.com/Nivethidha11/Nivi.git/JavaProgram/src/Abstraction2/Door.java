package Abstraction2;

public abstract class Door 
{
	String name;
	Door(String name)
	{
		this.name=name;
	}
	public abstract void unlock();
}
