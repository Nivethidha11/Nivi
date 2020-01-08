package Polymorphism1;

public class Machine 
{
	int produceShoePolish(int piece)
	{
		int res=piece/5;
		int res1=100*res;
		return res1;
	}
	float produceShoePolish(float hair)
	{
		float result=hair/(float)9.83;
		float result1=100*result;
		return result1;
	}
	int i;
	float c=0;
	
	float produceShoePolish(String msg)
	{
		String b[]=msg.split(" ");
		
		for(i=0;i<b.length;i++)
		{
			if(b[i].equals("coal"))
			{
				c++;
				//System.out.println(c);
			}
		}
		//System.out.println(c);
		float r=(c/27);
		float r1=100*r;
		return r1;
	}
}
