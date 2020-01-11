package class8;

import java.util.Scanner;

import class8.LapManager;

public class Main {

	public static void main(String[] args) {
		Scanner q=new Scanner(System.in);
		System.out.println("Enter the number of Laps:");
		int num=q.nextByte();
		int i;
		String a[]=new String[num];
		Lap t[]=new Lap[num];
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
		int ch;
		LapManager lm=new LapManager(a,num); 
		do
		{
			System.out.println("Lap Manager\n1. Lap Details\n2. Fastest in Lap\n3. Maximum Throws\n4. Exit\nEnter the choice");
			ch=q.nextInt();
			if(ch==1)
			{
				lm.display();
			}
			else if(ch==2)
			{
				lm.fast();
			}
			else if(ch==3)
			{
				lm.maxthr();
			}
			else if(ch==4)
			{
				System.out.println("Thank you!");
			}
		}while(ch>0 && ch<5);
	}

}
