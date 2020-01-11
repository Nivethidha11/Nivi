package class9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner q=new Scanner(System.in);
		System.out.println("Enter the number of races:");
		int races=q.nextInt();
		int race;
		int i,num=0;
		String a[]=new String[30];
		String racedetails[]=new String[30];
		Lap t[]=new Lap[30];
		Race r[]=new Race[30];
		for(race=0;race<races;race++)
		{
			System.out.println("Enter the Details of races "+(race+1));
			System.out.println("Enter the details of race no. and winning player");
			String details=q.next();
			r[race]=new Race(details);
			racedetails[race]=r[race].toString();
			String[] det=details.split(",");
			num=Integer.parseInt(det[0]);
			for(i=0;i<num;i++)
			{
				System.out.println("Enter the Details of lap :");
				byte no=q.nextByte();
				byte thr=q.nextByte();
				String player=q.next();
				float time=q.nextFloat();
				System.out.print("\n");
				t[i]=new Lap(no,thr,player,time);
				a[i]=t[i].toString();
			}
		}
		int ch;
		LapManager lm=new LapManager(a,num); 
		RaceManager rm=new RaceManager(racedetails,races);
		do
		{
			System.out.println("Race Manager\n1. Race Details\n2. Display races with lap count\n3. Display races won by (player)\n4. Exit\nEnter the choice");
			ch=q.nextInt();
			if(ch==1)
			{
				rm.display();
			}
			else if(ch==2)
			{
				rm.lapcount();
			}
			else if(ch==3)
			{
				rm.displayraces();
			}
			else if(ch==4)
			{
				System.out.println("Thank you!");
			}
		}while(ch>0 && ch<5);
	}

		

}
