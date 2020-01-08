package Abstraction1;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Shape");
		String name=s.next();
		if(name.equals("cube"))
		{
			System.out.println("Enter the side");
			float side=s.nextFloat();
			Cube c=new Cube(name,side);
			c.display();
		}
		else if(name.equals("sphere"))
		{
			System.out.println("Enter the radius");
			float radius=s.nextFloat();
			Sphere sp=new Sphere(name,radius);
			sp.display();
		}
		if(name.equals("cuboid"))
		{
			System.out.println("Enter the length");
			float length=s.nextFloat();
			System.out.println("Enter the radius");
			float radius=s.nextFloat();
			System.out.println("Enter the width");
			float width=s.nextFloat();
			Cuboid cd=new Cuboid(name,length,radius,width);
			cd.display();
		}
		else if(name.equals("cone"))
		{
			System.out.println("Enter the radius");
			float radius=s.nextFloat();
			System.out.println("Enter the heigth");
			float height=s.nextFloat();
			Cone cone=new Cone(name,radius,height);
			cone.display();
		}
	}

}
