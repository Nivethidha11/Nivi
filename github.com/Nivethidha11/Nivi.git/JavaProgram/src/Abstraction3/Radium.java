package Abstraction3;

public class Radium extends Star
{
	String name;
	String conname;
	int decay,energyemit,age,consumed;
	
	Radium(String name,String conname,int decay,int energyemit,int age,int consumed)
	{
	super(name,conname,energyemit,consumed);
	this.decay=decay;
	this.age=age;
	}
	int i,x=0,y=1,sum,sub;
	
	public float calculateYearsRemaining()
	{
		float res1=(this.decay*(this.decay+1)/2);
		float res2=res1-age;
		return res2;
	}
}
