package class5;

import java.util.Scanner;

import class5.Lap;

public class Main {

	public static void main(String[] args) 
	{
		Scanner q=new Scanner(System.in);
		System.out.println("Enter the number of Laps:");
		int num=q.nextByte();
		int i;
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
		}
		System.out.println("Lap Details:\n");
		for(i=0;i<num;i++)
		{
			t[i].display();
		}
	}
}
