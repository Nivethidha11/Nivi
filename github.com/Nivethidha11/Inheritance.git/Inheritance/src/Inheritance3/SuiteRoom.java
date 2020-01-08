package Inheritance3;

public class SuiteRoom extends HotelRoom
{
	SuiteRoom(String name,int sqclaw,int rate,boolean wifi,boolean ac)
	{
		super(name,sqclaw,rate,wifi,ac);
	}
	float res;
	void display()
	{
		if(wifi==true && ac==true)
		{
			res=50+75+rate;
			System.out.println("Hotel "+name+"\n"+(res*sqclaw)+" rocks");
		}
		else if(wifi==true && ac==false)
		{
			res=50+rate;
			System.out.println("Hotel "+name+"\n"+(res*sqclaw)+" rocks");
		}
		else if(ac==true && wifi==false)
		{
			res=75+rate;
			System.out.println("Hotel "+name+"\n"+(res*sqclaw)+" rocks");
		}
		else
		{
			System.out.println("Hotel "+name+"\n"+(rate*sqclaw)+" rocks");
		}
	}
}
