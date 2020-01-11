package class9;

import java.util.Scanner;

public class RaceManager 
{
	private int number;
	int i;
	String[] c=new String[20]; 
	public RaceManager(String b[],int num) 
	{
		for(i=0;i<num;i++)
		{
			c[i]=b[i];
		}
		number=num;
	}
	void display()
	{
		System.out.println("RACE NO LAPS WINNER (PLAYER)");
		for(int i=0;i<number;i++)
		{
			System.out.println((i+1)+" "+c[i]);
		}
	}
	
	void lapcount()
	{
		Scanner s=new Scanner(System.in);
		int i,j=0,k=0,index=0;
		String[] str;
		String str1[]=new String[20];
		String str2[]=new String[20];
		int [] arr = new int [20];
		System.out.println("Enter the lap count");
		int lc=s.nextInt();
		for(i=0;i<number;i++)
		{
			str=c[i].split(",");
			str1[j++]=str[0];
			str2[k++]=str[1];
		}
		for( i=0; i<j; i++) 
		{
	         arr[i] = Integer.parseInt(str1[i]);
	    }
		for(i=0;i<j;i++)
		{
			if(lc==arr[i])
			{
				index=i;
			}
		}
		System.out.println("RACE NO LAPS WINNER (PLAYER)");
		System.out.println((index+1)+" "+lc+" "+str2[index]);
	}
	
	void displayraces()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the player name");
		String s1=s.next();
		String[] str;
		String str1[]=new String[20];
		String str2[]=new String[20];
		int i,j=0,k=0,index=0;
		for(i=0;i<number;i++)
		{
			str=c[i].split(",");
			str1[j++]=str[0];
			str2[k++]=str[1];
		}
		for(i=0;i<k;i++)
		{
			if(str2[i].equals(s1))
			{
				index=i;
			}
		}
		System.out.println((index+1)+" "+str1[index]+" "+s1);
	}
	
}
