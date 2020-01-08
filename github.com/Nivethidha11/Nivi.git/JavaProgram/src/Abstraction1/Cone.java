package Abstraction1;

public class Cone extends Planet
{
	float radius,height;
	Cone(String name,float radius,float height)
	{
		super(name);
		this.radius=radius;
		this.height=height;
	}
	
	public void display()
	{
		float res=(1*22*radius*radius*height)/14;
		System.out.println("Volume of Cone  "+(int)res);
	}
}
