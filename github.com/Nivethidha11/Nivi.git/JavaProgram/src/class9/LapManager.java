package class9;

import java.util.Scanner;

public class LapManager {
private int number;
	
	String[] c=new String[20]; 
	public LapManager(String b[],int num) 
	{
		for(int i=0;i<num;i++)
		{
			c[i]=b[i];
		}
		number=num;
	}
	public String[] getC() {
		return c;
	}

	public void setC(String[] c) {
		this.c = c;
	}

	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void display()
	{
		System.out.println("LAP THROWS FASTEST PLAYER TIME");
		for(int i=0;i<number;i++)
		{
			System.out.println(c[i]);
		}
	}
	public void fast()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter lapno.");
		int lapno=s.nextInt();
		//System.out.println(lapno);
		int i;
		String str1;
		str1=c[lapno-1];
		String[] str=str1.split(" ");
//		for(i=0;i<str.length;i++)
//		{
			System.out.println("Player "+str[2]+"\n"+"Fastest Time "+str[3]);
			
//		}
	}
	
	public void maxthr()
	{
		String split[]=new String[20];
		String split1[]=new String[20];
		int [] arr = new int [20];
		int j=0,k,x=0,index=0;
		for(int i=0;i<number;i++)
		{
			String[] str=c[i].split(" ");
			split[j++]=str[1];
			split1[x++]=str[0];
		}
		for( k=0; k<j; k++) 
		{
	         arr[k] = Integer.parseInt(split[k]);
	    }
		int max=arr[0];
		for(k=0;k<j;k++)
		{
			if(arr[k]>max)
			{
				max=arr[k];
				index=k;
			}
			
		}
	      System.out.println(max+" throws were made in lap "+split1[index]);
	}

}
