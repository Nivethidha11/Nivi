package Polymorphism3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int sugar;
		int r,c,i,j;
		r=c=3;
		String[][] str=new String[r][c];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sugar: ");
		sugar=s.nextInt();
		System.out.println("Enter pattern");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				str[i][j]=s.next();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(str[i][j]+" ");
			}
			System.out.print("\n");
		}
		Machine m=new Machine(sugar);
		m.pushBigRedButton();
		Telescope t=new Telescope(str);
		t.pushBigRedButton();
	}

}
