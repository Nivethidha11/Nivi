package Interface2;

public class Expo 
{
	Painting[] list;
	Expo()
	{
		list =new Painting[3];
		list[0]=new Painting((float)100,"Water");
		list[1]=new Painting((float)500,"Glass");
		list[2]=new Painting((float)1000,"Oil");
	}
	
	void display()
	{
		int i;
		System.out.println("Basic prices");
		for(i=0;i<3;i++)
		{
			System.out.print("Painting "+(i+1)+"\nType "+list[i].type+" "+"Cost "+list[i].value);
		}
	}
}
