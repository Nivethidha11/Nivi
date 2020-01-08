package Abstraction1;

public class Sphere extends Planet{
	float radius;
	Sphere(String name,float radius)
	{
		super(name);
		this.radius=radius;
	}
	
	public void display()
	{
		float res=(4*22*radius*radius*radius)/21;
		System.out.println("Volume of Sphere  "+(int)res);
	}
}
