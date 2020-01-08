package Abstraction1;

public class Cuboid extends Planet
{
	float length;
	float radius;
	float width;
	Cuboid(String name,float length,float radius,float width)
	{
		super(name);
		this.length=length;
		this.radius=radius;
		this.width=width;
	}
	
	public void display()
	{
		float result=length*radius*width;
		System.out.println("Volume of Cuboid  "+(int)result);
	}

}
