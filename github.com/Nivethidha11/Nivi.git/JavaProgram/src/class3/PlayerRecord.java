package class3;

public class PlayerRecord 
{
	byte m,w,l;
	float avgl,maxl,avgt,maxt;
	PlayerRecord(byte m,byte w,byte l,float avgl,float maxl,float avgt,float maxt)
	{
		this.m=m;
		this.w=w;
		this.l=l;
		this.avgl=avgl;
		this.maxl=maxl;
		this.avgt=avgt;
		this.maxt=maxt;
	}
	void display()
	{
		System.out.print(m+" "+w+" "+l+" "+avgl+" "+maxl+" "+avgt+" "+maxt);
	}
}
