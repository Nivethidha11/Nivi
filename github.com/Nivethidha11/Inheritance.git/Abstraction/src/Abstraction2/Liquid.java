package Abstraction2;

public class Liquid extends Door
{
	int flow;
	Liquid(String name,int flow)
	{
		super(name);
		this.flow=flow;
	}
	public void unlock()
	{
		int i,prime=0,j,c=0;
		double prime1;
		for(i=2;prime<flow;i++)
		{
			c=1;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c=0;
					break;
				}
			}
			if(c==1)
			{
				prime++;
				prime1=(Math.pow(2, i))-1;
				System.out.print((int)prime1+" ");
			}
		}
	}
}
