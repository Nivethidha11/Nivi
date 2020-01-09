package Abstraction4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String name,email,mobile,bookingid,bookingdate;
		float bcashpaid,bcash;
		
		System.out.println("Passanger Details");
		System.out.println("Enter name");
		name=s.next();
		System.out.println("Enter email");
		email=s.next();
		System.out.println("Enter mobile");
		mobile=s.next();
		System.out.println("Enter bcash");
		bcash=s.nextFloat();
		
		System.out.println("Booking Details");
		System.out.println("Enter booking id");
		bookingid=s.next();
		System.out.println("Enter booking date");
		bookingdate=s.next();
		System.out.println("Enter bcashpaid");
		bcashpaid=s.nextFloat();
		
		System.out.println("1. Update Details\n2. Recharge bcash\n3. Book room\n4. Cancel room\n5. Add Coupon\n6. Apply discount\nEnter the choice");
		int ch=s.nextInt();
		User u=new User(name,email,mobile,bcash);
		RegularUser ru=new RegularUser(bookingid,bookingdate,bcashpaid);
		if(ch==1)
		{
			
			u.display();
		}
		else if(ch==2)
		{
			u.recharge();
		}
		else if(ch==3)
		{
			
		}
	}

}
