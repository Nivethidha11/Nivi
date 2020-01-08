package class8;

public class Lap {
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
	public byte getNo() {
		return no;
	}
	public byte getThr() {
		return thr;
	}
	public String getPlayer() {
		return player;
	}
	public float getTime() {
		return time;
	}
}