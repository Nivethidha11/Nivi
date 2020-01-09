package Interface3;

import java.util.Scanner;

public class KutchiController implements Ihuman,Irobot 
{
	static float cash;
	static int energy;
	KutchiController(float cash1,int energy1)
	{
		cash=cash1;
		energy=energy1;
	}
	void display()
	{
		System.out.println("Current energy :"+energy+"\n"+"Cash :"+cash);
	}
	public void buy()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the item name");
		String item=s.next();
		System.out.println("Enter the item price");
		int price=s.nextInt();
		System.out.println(item+" is bought for the given price of Rs."+price);
	}
	public void socialize()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the hours");
		float hours=s.nextFloat();
		float mul=hours*6;
		energy=energy-(int)mul;
		System.out.println("Energy :"+energy);
	}
	public void work()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the hours");
		float hours=s.nextFloat();
		float mul=hours*5;
		float addcash=hours*15;
		energy=energy-(int)mul;
		System.out.println("Energy :"+energy+"\n"+"Total Cash: "+(cash+addcash));
	}
	public void maintainence()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the hours");
		float hours=s.nextFloat();
		float div=hours/1.5f;
		float mul=div*3;
		float addcash=div*7;
		energy=energy-(int)mul;
		System.out.println("Energy :"+energy+"\n"+"Total Cash: "+(cash+addcash));
	}
	public void paintandsell()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the hours");
		float hours=s.nextFloat();
		float div=hours/2;
		float mul=div*5;
		float addcash=div*9;
		energy=energy-(int)mul;
		System.out.println("Energy :"+energy+"\n"+"Total Cash: "+(cash+addcash));
		
	}
	public void restfor()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the hours");
		float hours=s.nextFloat();
		float div=hours/2.5f;
		float mul=div*7;
		float addcash=div*3;
		energy=energy+(int)mul;
		System.out.println("Energy :"+energy+"\n"+"Total Cash: "+(cash-addcash));
		
	}
	
}
