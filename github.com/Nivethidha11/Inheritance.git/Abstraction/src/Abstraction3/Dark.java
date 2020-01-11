package Abstraction3;

public class Dark extends Star
{
	String name;
	String conname;
	int decay,energyemit,age,consumed;
	
	Dark(String name,String conname,int decay,int energyemit,int age,int consumed)
	{
	super(name,conname,energyemit,consumed);
	this.decay=decay;
	this.age=age;
	}
	int i,c=0,num=1,result=0,fin;
	
	public float calculateYearsRemaining()
	{
		while(c<decay)
		{
			num=num+1;
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					break;
				}
			}
			if(i==num)
			{
				c=c+1;
			}
		}
		
		//System.out.println(sum);
		result=result+num;
		fin=result-age;
		return fin;
	}
}

