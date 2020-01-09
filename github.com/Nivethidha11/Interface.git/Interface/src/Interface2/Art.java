package Interface2;
import java.util.*;
public class Art extends Expo implements Itrade 
{
	Art()
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
			mul=(float)list[0].value*2.5f;
		}
		else if(ch==2)
		{
			mul=(float)list[0].value*0.75f;
		}
		else
		{
			mul=(float)list[0].value*1.5f;
		}
		return mul;
	}
	float multiply;
	public float sell(Painting p)
	{
		if(p.type.equals(list[0].type))
		{
			multiply=(float)list[0].value*1.25f;
		}
		else if(p.type.equals(list[1].type))
		{
			multiply=(float)list[1].value*0.35f;
		}
		else if(p.type.equals(list[2].type))
		{
			multiply=(float)list[2].value*1.10f;
		}
		return multiply;
	}
}
