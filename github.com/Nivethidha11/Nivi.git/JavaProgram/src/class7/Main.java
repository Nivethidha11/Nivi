package class7;

import java.util.Scanner;

import class7.Lap;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner q=new Scanner(System.in);
		System.out.println("Enter the number of Laps:");
		int num=q.nextByte();
		int i;
		LapManager t[]=new LapManager[num];
		for(i=0;i<num;i++)
		{
			System.out.println("Enter the Details of lap :");
			byte no=q.nextByte();
			byte thr=q.nextByte();
			String player=q.next();
			float time=q.nextFloat();
			System.out.print("\n");
			t[i]=new LapManager(no,thr,player,time);
		}
		for(i=0;i<num;i++)
		{
			t[i].display();
		}
		
	}
}
