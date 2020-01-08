package Inheritance3;

public class DeluxeACRoom extends HotelRoom 
{
	DeluxeACRoom(String name,int sqclaw,int rate,boolean wifi,boolean ac)
	{
		super(name,sqclaw,rate,wifi,ac);
	}
	float res;
	void display()
	{
		if(ac==true)
		{
			res=50+rate;
			System.out.println("Hotel "+name+"\n"+(res*sqclaw)+" rocks");
		}
		else
		{
			System.out.println("Hotel "+name+"\n"+(rate*sqclaw)+" rocks");
		}
	}
}
