package Inheritance3;

public class DeluxeRoom extends HotelRoom
{
	DeluxeRoom(String name,int sqclaw,int rate,boolean wifi,boolean ac)
	{
		super(name,sqclaw,rate,wifi,ac);
	}
	float res;
	void display()
	{
		if(wifi==true)
		{
			res=10+rate;
			System.out.println("Hotel "+name+"\n"+(res*sqclaw)+" rocks");
		}
		else
		{
			System.out.println("Hotel "+name+"\n"+(rate*sqclaw)+" rocks");
		}
	}
}
