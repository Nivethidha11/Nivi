package class5;



public class Lap 
{
	byte no;
	byte thr;
	String player;
	float time;
	Lap(byte no,byte thr,String player,float time)
	{
		this.no = no;
		this.thr = thr;
		this.player = player;
		this.time = time;
	}
	public int getNo() {
		return no;
	}
	public int getThr() {
		return thr;
	}
	public String getPlayer() {
		return player;
	}
	public float getTime() {
		return time;
	}
	void display()
	{
		System.out.print("Lap: "+no+"\n"+"Throws: "+thr+"\n"+"Fastest Player: "+player+"\n"+"Fastest Time: "+time+"s"+"\n");
	}
}
