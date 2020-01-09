package Polymorphism3;

public class Telescope 
{
	String [][] str1=new String[3][3];
	Telescope(String [][]str)
	{
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				str1[i][j]=str[i][j];
			}
		}
	}
	
	void pushBigRedButton()
	{
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(str1[i][j].equals("1"))
				{
					str1[i][j]="*";
				}	
				else if(str1[i][j].equals("0"))
				{
					str1[i][j]=" ";
				}	
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(str1[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
