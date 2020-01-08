package class7;

public class LapManager extends Lap
{
	
	LapManager(byte no,byte thr,String player,float time)
	{
		super(no,thr,player,time);
	}
	public void display()
	{
		System.out.print("Lap: "+no+"\n"+"Throws: "+thr+"\n"+"Fastest Player: "+player+"\n"+"Fastest Time: "+time+"s"+"\n");
	}
}
