package Interface1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1. Regular\n2. Glass\n3. Oil\nEnter the choice");
		int ch=s.nextInt();
		System.out.println("Enter the type");
		String type=s.next();
		System.out.println("Enter the size");
		int size=s.nextInt();
		
		if(ch==1)
		{
			RegularCanvas rc=new RegularCanvas(type,size);
			rc.paint();
		}
		
		else if(ch==2)
		{
			GlassCanvas gc=new GlassCanvas(type,size);
			gc.paint();
		}
		
		else if(ch==3)
		{
			OilCanvas oc=new OilCanvas(type,size);
			oc.paint();
		}
	}

}
