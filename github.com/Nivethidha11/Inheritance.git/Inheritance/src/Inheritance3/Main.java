package Inheritance3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("1. Deluxe Room\n2. Deluxe AC Room\n3. Luxury Suite\nChoose room: ");
		int ch=s.nextInt();
		System.out.println("Enter hotel name: ");
		String name=s.next();
		System.out.println("Enter room area: ");
		int sqclaw=s.nextInt();
		System.out.println("Enter rate/sq claw: ");
		int rate=s.nextInt();
		System.out.println("Hotel has Wifi? ");
		boolean wifi=s.nextBoolean();
		System.out.println("Hotel has AC? ");
		boolean ac=s.nextBoolean();
		if(ch==1)
		{
			DeluxeRoom dr=new DeluxeRoom(name,sqclaw,rate,wifi,ac);
			dr.display();
		}
		else if(ch==2)
		{
			DeluxeACRoom dac=new DeluxeACRoom(name,sqclaw,rate,wifi,ac);
			dac.display();	
		}
		else
		{
			SuiteRoom sr=new SuiteRoom(name,sqclaw,rate,wifi,ac);
			sr.display();
		}
	}

}
