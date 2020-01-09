package Interface2;

import java.util.Scanner;

public class BlackMarket extends Expo implements Itrade 
{
	BlackMarket()
	{
		super();
	}
	Scanner s=new Scanner(System.in);
	float mul;
	public float buy()
	{
		int i;
		System.out.println("The Products are");
		for(i=0;i<3;i++)
		{
			System.out.println((i+1)+" "+list[i].type);
		}
		int ch=s.nextInt();
		if(ch==1)
		{
			mul=(float)list[0].value*0.5f;
		}
		else if(ch==2)
		{
			mul=(float)list[0].value*1.75f;
		}
		else
		{
			mul=(float)list[0].value*2.75f;
		}
		return mul;
	}
	float multiply;
	public float sell(Painting p)
	{
		if(p.type.equals(list[0].type))
		{
			multiply=(float)list[0].value*0.25f;
		}
		else if(p.type.equals(list[1].type))
		{
			multiply=(float)list[1].value*1.35f;
		}
		else if(p.type.equals(list[2].type))
		{
			multiply=(float)list[2].value*2.25f;
		}
		return multiply;
	}
}
