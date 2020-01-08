package class3;
//import java.lang.*;
public class PlayerRecord 
{
	int m,w,l;
	float avgl,maxl,avgt,maxt;
	PlayerRecord(byte m,int max,int min,float avgl,float maxl,float avgt,float maxt)
	{
		this.m=m;
		w=max;
		l=min;
		this.avgl=avgl;
		this.maxl=maxl;
		this.avgt=avgt;
		this.maxt=maxt;
	}
	void display()
	{
		System.out.print("Player Record -\nMatches Played:"+m+"\nWin/Loss Ratio:"+w+":"+l+"\nAvg/Max Lap Speed:"+avgl+"|"+maxl+"\nAvg/Max Throw Distance: "+avgt+"|"+maxt);
	}
}
