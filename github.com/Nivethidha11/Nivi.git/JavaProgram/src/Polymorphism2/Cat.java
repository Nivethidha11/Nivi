package Polymorphism2;

public class Cat extends Machine
{
	String sounds;
	float height;
	int distance;	
	Cat(float energy,String sounds,float height,int distance)
	{
		super(energy);
		this.sounds=sounds;
		this.height=height;
		this.distance=distance;
	}
	int i;
	float c=0;
	float generateEnergy(String sounds)
	{
		String b[]=sounds.split(" ");
		
		for(i=0;i<b.length;i++)
		{
			if(b[i].equals("meow"))
			{
				c++;
			}
		}
		//System.out.println(c);
		float q=c/5.0f;
		float mul=q*15;
		return mul;
	}
	float generateEnergy(float height)
	{
		float div=height/10.75f;
		float mul=div*7.2f;
		return mul;
	}
	float generateEnergy(int distance)
	{
		float divide=distance/172;
		float result=divide*12.35f;
		return result;
	}
}
