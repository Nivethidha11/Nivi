package Abstraction3;

public class Plasma extends Star 
{
	String name;
	String conname;
	int decay,energyemit,age,consumed;
	
	Plasma(String name,String conname,int decay,int energyemit,int age,int consumed)
	{
	super(name,conname,energyemit,consumed);
	this.decay=decay;
	this.age=age;
	}
	int i,x=0,y=1,sum,sub;
	
	public float calculateYearsRemaining()
	{
		
		for(i=1;i<this.decay;i++)
		{
			sum=x+y;
			x=y;
			y=sum;
		}
		
		//System.out.println(sum);
		sub=sum-age;
		return sub;
	}
}