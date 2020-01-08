package Abstraction1;

public class Cube extends Planet 
{
	float side;
	Cube(String name,float side)
	{
		super(name);
		this.side=side;
	}
	
	
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	
	public void display()
	{
		float res=side*side*side;
		System.out.println("Volume of cube  "+(int)res);
	}
}
